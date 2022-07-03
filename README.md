# Triple Traveler Club Mileage Service Back-End API Development Assignment
## 트리플 여행자 클럽 마일리지 서비스 Back-End API 개발 과제
 
### Prerequisites(선행 조건)
 - Spring Boot
 - Spring-boot-starter
 - Thymeleaf (ver 2.7.1)
 - JPA (ver 2.7.1), Hibernate (ver 5.6.9)
 - Lombok
 - Validation
 - JDK
 - Gradle
 - H2 Database


### How to Run(실행 방법)

1. H2 Database 실행 : h2 디렉토리의 bin 폴더 내에서 아래의 코드를 실행

```
./h2.sh
```

2. 애플리케이션 실행 : Spring Boot 내에서 ReviewApplication을 실행

>현재 매핑 관계 오류로 인해 실행이 되지 않습니다...

### 과제를 완수하지 못한 이유

1. JPA와 연관 관계 매핑에 대한 이해 부족
2. 도메인 설계 시, 도메인 간의 연관 관계 이해 부족
3. 에러 발생 : 리스트 형태의 매핑 관계 오류 해결하지 못함
