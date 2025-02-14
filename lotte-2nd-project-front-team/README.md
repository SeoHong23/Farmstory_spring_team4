🌾 FarmStory: 커뮤니티 농산품 상거래 플랫폼 🌾



FarmStory는 농산물 거래를 위한 커뮤니티 기반의 상거래 플랫폼입니다.
회원과 관리자가 효율적으로 상품을 관리 및 거래할 수 있도록 설계된 웹 애플리케이션입니다.

🛠️ 프로젝트 개요

FarmStory는 농산물의 생산 및 유통 과정을 효율적으로 관리하고, 소비자와 생산자를 연결하는 플랫폼입니다.

👨‍💻 개발 인원 및 기간

개발 인원: 5명

개발 기간: 2024-09-27 ~ 2024-10-04 (8일)

📌 담당 역할

회원 인증 및 소셜 로그인 구현

Spring Security와 OAuth 2.0을 활용한 로그인 및 권한 관리

Google OAuth 기반 소셜 로그인 기능 구현

게시판 및 게시물 관리

CRUD(Create, Read, Update, Delete) 기능 제공

Thymeleaf를 활용한 서버 기반 동적 렌더링

보안 및 접근 제어

Spring Security 기반 역할(Role-Based Access Control) 관리

관리자 페이지와 일반 사용자 페이지 접근 구분

데이터 관리

JPA 활용한 데이터베이스 접근 및 처리

Repository 패턴을 통한 유지보수성 향상

서버 관리 및 배포

AWS EC2 서버 배포 및 환경 최적화

GitHub Actions를 통한 CI/CD 구축

🛠️ 기술 스택

분야

기술 스택

Frontend

HTML, CSS, JavaScript, Thymeleaf

Backend

Spring Boot, JPA, QueryDSL, MyBatis

Database

MySQL

Deploy

AWS (EC2, S3, RDS)

Versioning

Git, GitHub

CI/CD

GitHub Actions, Docker

🌟 주요 기능

🎯 사용자 기능

회원가입 및 로그인: 일반 로그인 및 소셜 로그인(OAuth 2.0)

상품 검색 및 필터링: 카테고리별 검색, 키워드 검색 지원

장바구니 및 주문: 장바구니 담기, 주문 내역 확인 및 관리

포인트 및 리뷰 시스템: 포인트 적립 및 사용, 상품 리뷰 작성

🔧 관리자 기능

상품 관리: 상품 추가, 수정, 삭제

회원 관리: 회원 등급 설정, 블랙리스트 관리

주문 관리: 주문 상태 변경 및 배송 관리

통계 분석: 매출 분석, 인기 상품 조회

🚀 설치 및 실행

1. 프로젝트 클론

git clone https://github.com/your-repo/farmstory.git
cd farmstory

2. 환경 변수 설정

src/main/resources/application.yml 파일을 생성하고 필요한 환경 설정을 추가하세요.

3. Gradle 빌드 및 실행

./gradlew build
./gradlew bootRun

4. 웹 애플리케이션 접속

http://localhost:8080

🖼️ 스크린샷

메인 페이지



관리자 페이지



📈 데이터베이스 ERD



📜 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다.

🤝 기여하기

FarmStory 프로젝트에 기여하고 싶다면 다음 단계를 따라주세요:

리포지토리를 포크합니다.

새로운 기능을 추가하거나 버그를 수정합니다.

Pull Request를 제출합니다.

📫 문의하기

이메일: support@farmstory.com

GitHub Issues를 통해 문의 가능
