class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=0; i<number; i++) {
            // 약수의 개수 구해서 divisor에 저장
            int count = 0;
            for (int j = 1; j * j <= i + 1; j++) {
                if ((i+1) % j == 0) {
                    count += 1;         // j는 약수
                    if (j != (i+1) / j) {
                        count += 1;     // j와 i/j가 다르면 짝 약수도 포함
                    }
                }
            }
            
            // limit을 넘는 경우 power 값 저장
            if (count > limit) {
                count = power;
            }
            
            // answer 값에 더하기
            answer += count;
        }
        
        return answer;
    }
}