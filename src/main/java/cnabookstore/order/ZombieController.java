package cnabookstore.order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ZombieController {

    private int no = 0;
    List<String> zombies;

    public ZombieController(){
        zombies = new ArrayList<String>();
    }

    @GetMapping({"/zombie"})
    public void getStockInputs() {
        //public Iterable<StockInput> getStockInputs(Pageable p) {
//        ZombieThread zombie = new ZombieThread("zombie "+ no);
//
//        zombie.run();
//
//        System.out.println("A zombie wakes up");
//
//        no += 1;
        String newZombie = "=================================================================="
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        "
                + "========================================================================================        ";
        zombies.add(newZombie);

        System.gc();
        Runtime r = Runtime.getRuntime();
        System.out.println("전체 힙 메모리" + r.totalMemory());
        long firstMemorySize = r.freeMemory();

        출처: https://whiteship.tistory.com/1062 [Whiteship's Note]
        System.out.println("total zombies are : " + zombies.size()+ " free memory size : "+ firstMemorySize);

    }

//    public class ZombieThread extends Thread {
//
//        String str;
//
//        public ZombieThread(String str){
//            this.str = str;
//        }
//
//        public void run(){
//            while(true){
//                System.out.print(str);
//                try {
//                    //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩
//                    //쉬었다가 출력할 수 있게한다.
//                    Thread.sleep((int)(Math.random() * 1000));
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
