package account;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    ArrayList<Account> accountsList = new ArrayList<>();
    Random random = new Random();

    private boolean isAccountNumberDuplicate(long accountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    public void addAccount(String customerName, long initialBalance) {
        while(true){
            long accountNumber = 0;
            String accountNumberString = "";

            for (int i = 0; i < 13; i++){
                accountNumberString += random.nextInt(10) + "";
                accountNumber = Long.parseLong(accountNumberString);
            }

            if(!isAccountNumberDuplicate(accountNumber)){
                Account newAccount = new Account(customerName, initialBalance, accountNumber);
                accountsList.add(newAccount);
                System.out.println("계좌가 생성 되었습니다. 계좌 번호는 " + accountNumber + " 입니다.");
                break;
            }
        }
    }

    public void printAllAccounts(String customerName) {
        boolean flag = false;
        for (int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getCustomerName().equals(customerName)) {
                System.out.println(customerName + "님의 계좌 정보를 알려드리겠습니다");
                System.out.println("성함: " + customerName);
                System.out.println("현재 잔액: " + accountsList.get(i).getBalance());
                System.out.println("계좌 번호: " + accountsList.get(i).getAccountNumber());
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }

    public void depositToAccount(long accountNumber,long amount) {
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getAccountNumber() == accountNumber){
                accountsList.get(i).deposit(amount);
                System.out.println("입금이 완료 되었습니다.");
                System.out.println(accountsList.get(i).getCustomerName() + "님의 현재 잔액은 " + accountsList.get(i).getBalance() + "입니다.");
                return;
            }
        }
        System.out.println("계좌번호를 찾을 수 없습니다.");
    }

    public void withdrawFromAccount(long accountNumber,long amount) {
        boolean flag = false;
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getAccountNumber() == accountNumber){
                if (accountsList.get(i).getBalance() >= amount) {
                    accountsList.get(i).withdraw(amount);
                    System.out.println("출금이 완료 되었습니다.");
                    System.out.println("현재 잔액은 " + accountsList.get(i).getBalance() + "원 입니다.");
                    flag = true;
                    return;
                } else {
                    flag = true;
                    System.out.println("잔액이 부족합니다.");
                }
            }
        }
        if(flag == false){
            System.out.println("계좌번호를 찾을 수 없습니다.");
        }
    }
}

