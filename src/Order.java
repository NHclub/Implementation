import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    /*
    주문 관리 시스템 만들기
    주문 목록은 ArrayList<Order>형식으로 관리하고, 주문 추가, 삭제, 목록 출력, 전체 가격 출력 기능은 모두 이 목록에 대해 수행되어야 합니다.
    주문 추가: 사용자는 음식 이름과 가격을 입력하여 주문을 추가할 수 있습니다
    주문 삭제: 사용자는 주문을 삭제할 수 있습니다. 삭제를 위해 음식 이름을 입력합니다.
    주문 목록 출력: 사용자는 현재 주문 목록을 출력할 수 있습니다. 각 주문은 음식 이름과 가격으로 표시됩니다.
    전체 주문 가격 출력: 사용자는 전체 주문 가격을 출력할 수 있습니다.

    구현되어야 할 멤버:
    name(음식이름)
    price(가격)

    addOrder(String name, int price): 주문 추가
    removeOrder(String name): 주문 삭제
    printOrders(): 주문 목록 출력
    totalPrice(): 전체 주문 가격 출력
    */

    public Order() {
    }

    public Order(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Order(String name) {
        this.name = name;
    }

    List<Order> orders = new ArrayList<>();
    String name;
    int price;

    public void addOrder(String name, int price) {
        Order newOrder = new Order(name, price);
        orders.add(newOrder);
    }


    public void removeOrder(String name){
        for(int i = 0; i<orders.size(); i++){
            if (orders.get(i).name.equals(name)){
                orders.remove(i);
                break;
            }
        }
    }

    public void printOrders(){
        for (Order i:orders) {
            System.out.println(i.name);
        }
    }

    public void totalPrice(){
        int sumPrice = 0;
        for (Order i:orders) {
            sumPrice += i.price;
        }
        System.out.println(sumPrice);
    }




    public static void main(String[] args) {

        Order order = new Order();
        order.addOrder("김치찌개",8000);
        order.addOrder("된장찌개",8000);
        order.addOrder("제육볶음",7000);
        order.addOrder("부대찌개",8500);
        order.addOrder("라면",4000);
        order.printOrders();
        order.totalPrice();
        order.removeOrder("제육볶음");
        order.removeOrder("라면");
        order.printOrders();
        order.totalPrice();


    }
}