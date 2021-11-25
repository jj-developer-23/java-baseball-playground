## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

--- 
### 기능 목록
[] 1-9 까지 중복되지않은 랜덤 세자리 수 생성
[x] 세자리 수 비교
    [x] 같은 자리 같은 수이면 스트라이크
    [x] 다른 자리 같은 수이면 볼
    [x] 같은 수가 없으면 낫싱
[x] 세자리 수와 하나의 볼(자리수, 숫자) 비교
    [x] 같은 자리 같은 수이면 스트라이크
    [x] 다른 자리 같은 수이면 볼
    [x] 같은 수가 없으면 낫싱
[x] 자리수와 숫자 비교
    [x] 같은 자리 같은 수이면 스트라이크
    [x] 다른 자리 같은 수이면 볼
    [x] 같은 수가 없으면 낫싱
[] 입력 값 세자리 확인
[] 스트라이크 게임 중단/ 재시작 선택

