package account;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    ArrayList<Account> accountsList = new ArrayList<>();
    Random random = new Random();
    public void addAccount(String customerName, long initialBalance) {
        while(true){
            long accountNumber = 0;
            String accountNumberString = "";

            for (int i = 0; i < 13; i++){
                accountNumberString += random.nextInt(10) + "";
                accountNumber = Long.parseLong(accountNumberString);
            }

            if(!accountsList.contains(accountNumber)){
                Account newAccount = new Account(customerName, initialBalance, accountNumber);
                accountsList.add(newAccount);
                System.out.println("계좌가 생성 되었습니다. 계좌 번호는 " + accountNumber + " 입니다.");
                break;
            } else{
                continue;
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
}
