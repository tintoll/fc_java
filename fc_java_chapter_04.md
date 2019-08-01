## Chapter 4

Break 문
- 감싸고 있는 블록의 제어를 빠져나올때 사용한다.

- 반복, 조건, switch-case문 과 같이 쓰이며 현재 수행하고 있던 블록에서 수행을 중지하고 외부로 제어가 이동된다.

- 반복문에서 특정 조건일때 반복을 중지하는 기능을 구현할때 사용된다.

  ```java
  // 합이 100 넘었을때의 number값을 구하라
  int sum = 0;
  int num;
  for(num = 1; ; num++) {
    sum += num;
    if(sum >= 100) break;
  }
  System.out.println("sum : "+sum);
  System.out.println("num : "+num);
  ```

  

Continue문

- 반복의 수행중 조건문과 조건이 맞는 경우 이후 블럭내부의 다른 수행문을 수행하지 않을 경우에 사용한다.

  ```java
  // 3의 배수만 출력해라 
  int num;
  for(num = 1; num <= 100; num++) {
    if((num % 3) != 0) continue;
    System.out.println(num);
  }
  ```

  