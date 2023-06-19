/*
    캡슐 판매 기계 구현하기
    캡슐 판매 기계는 다양한 상품을 무작위로 판매합니다.
    상품 추가: 상품 이름을 입력하여 새로운 상품을 추가합니다. 같은 이름의 상품이 이미 존재한다면 추가하지 않습니다.
    상품 판매: 무작위로 한 가지 상품을 판매(출력)합니다. 만약 판매할 상품이 없다면, "상품이 없습니다."를 출력합니다.
    상품 목록 출력: 기계에 남아있는 모든 상품의 목록을 출력합니다.
    이 클래스는 ArrayList<String> 형식의 상품 목록을 가지고 있어야 합니다.
    addProduct(String product): 상품 추가
    sellProduct(): 상품 판매
    printProducts(): 상품 목록 출력
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CapsuleMachineService {
    List<String> products = new ArrayList<>();
    Random random = new Random();
    public void addProduct(String product) {
        if(!products.contains(product)){
            products.add(product);
            System.out.println("상품이 추가 되었습니다. '" + product + "'");
        }else {
            System.out.println("이미 존재하는 상품입니다.");
        }
    }
    public void sellProduct() {
        int randomProductIndex = random.nextInt(products.size());
        if (products.size() > 0) {
            System.out.println("판매가 완료 되었습니다. '" + products.get(randomProductIndex) + "'");
            products.remove(randomProductIndex);
        } else{
            System.out.println("상품이 없습니다.");
        }
    }
    public void printProducts() {
        System.out.println("현재 상품 목록입니다: " + products.toString());
    }

    public static void main(String[] args) {
        CapsuleMachineService capsuleMachineService = new CapsuleMachineService();
        capsuleMachineService.addProduct("사과");
        capsuleMachineService.addProduct("불고기");
        capsuleMachineService.addProduct("감자");
        capsuleMachineService.sellProduct();
        capsuleMachineService.printProducts();

    }

}
