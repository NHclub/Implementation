package account;

import java.util.Random;

/*
●계좌 관리 프로그램 구현하기
은행에서 고객들의 계좌를 관리하는 프로그램입니다.
●구현해야 할 기능
Account 클래스
customerName: 고객 이름, balance: 현재 잔액
deposit(double amount): 입금 기능
withdraw(double amount): 출금 기능, 출금하려는 금액이 현재 잔액보다 많을 경우 출금이 되지 않아야 함.
getBalance(): 현재 잔액을 반환하는 메소드
Bank 클래스
addAccount(String customerName, double initialBalance): 계좌 생성
printAllAccounts(): 모든 계좌 정보 출력
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account();

        bank.addAccount("nhman1",5000000);
        bank.addAccount("nhman2",4000000);
        bank.addAccount("nhman3",3000000);
        bank.addAccount("nhman4",2000000);
        bank.addAccount("nhman5",1000000);
        bank.printAllAccounts("nhman1");
        bank.printAllAccounts("nhman2");
        bank.printAllAccounts("nhman7");
        bank.printAllAccounts("nhman4");
        bank.printAllAccounts("nhman");
    }

}
