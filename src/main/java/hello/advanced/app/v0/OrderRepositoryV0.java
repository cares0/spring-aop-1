package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId) {
        // 저장 로직
        if (itemId.equals("ex")) { // 상품 id가 ex인 경우 예외 발생
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000); // 상품 저장에는 시간이 소요
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
