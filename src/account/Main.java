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

        // 계좌 생성 테스트
        bank.addAccount("홍길동", 50000);
        bank.addAccount("김철수", 30000);

        // 고객명으로 계좌 정보 출력 테스트
        System.out.println("\n홍길동의 계좌:");
        bank.printAllAccounts("홍길동");

        System.out.println("\n김철수의 계좌:");
        bank.printAllAccounts("김철수");

        // 첫 번째로 생성한 계좌의 계좌번호를 가져옴
        long accountNumberHong = bank.accountsList.get(0).getAccountNumber();

        // 입금 테스트
        System.out.println("\n홍길동의 계좌에 5000 입금:");
        bank.depositToAccount(accountNumberHong, 5000);

        // 출금 테스트 (잔액보다 큰 금액으로 출금)
        System.out.println("\n홍길동의 계좌에서 60000 출금:");
        bank.withdrawFromAccount(accountNumberHong, 60000);
        bank.printAllAccounts("홍길동");

        // 출금 테스트 (잔액보다 작은 금액으로 출금)
        System.out.println("\n홍길동의 계좌에서 40000 출금:");
        bank.withdrawFromAccount(accountNumberHong, 40000);
        bank.printAllAccounts("홍길동");

        // 존재하지 않는 계좌에서 출금 테스트
        System.out.println("\n존재하지 않는 계좌에서 출금 테스트:");
        bank.withdrawFromAccount(1234567890123L, 5000);

        // 존재하지 않는 계좌로 입금 테스트
        System.out.println("\n존재하지 않는 계좌로 입금 테스트:");
        bank.depositToAccount(1234567890123L, 5000);
    }
}
