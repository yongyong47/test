import java.util.ArrayList;
import java.util.List;

class Solution {
public int[] solution(int[] answers) {
int[] one = {1, 2, 3, 4, 5}; // 1번 수포자의 패턴
int[] two = {2, 1, 2, 3, 2, 4, 2, 5}; // 2번 수포자의 패턴
int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자의 패턴
    int onescore = 0; // 1번 수포자의 점수
    int twoscore = 0; // 2번 수포자의 점수
    int threescore = 0; // 3번 수포자의 점수

    // 각 수포자의 점수를 계산
    for (int i = 0; i < answers.length; i++) {
        if (answers[i] == one[i % one.length]) onescore++;
        if (answers[i] == two[i % two.length]) twoscore++;
        if (answers[i] == three[i % three.length]) threescore++;
    }

    // 가장 높은 점수를 찾기
    int maxScore = Math.max(onescore, Math.max(twoscore, threescore));

    // 가장 높은 점수를 받은 수포자를 리스트에 추가
    List<Integer> topScorers = new ArrayList<>();
    if (onescore == maxScore) topScorers.add(1);
    if (twoscore == maxScore) topScorers.add(2);
    if (threescore == maxScore) topScorers.add(3);

    // 리스트를 배열로 변환하여 반환
    int[] answer = new int[topScorers.size()];
    for (int i = 0; i < topScorers.size(); i++) {
        answer[i] = topScorers.get(i);
    }

    return answer;
}
}