public class programmers_체육복 {
    public static void main(String[] args) {
        int n =5; // 학생 수
        int lost[] = {1,2}; //도난당한 친구들
        int reserve[] = {2,3}; // 여벌이 있는 친구들 +-1 로만 빌려줄 수 잇다.

    System.out.println(solution( n, lost, reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length; // 잃어버린친구들 빼준다
        boolean[] rent = new boolean[reserve.length]; //빌려주면 true 로 해준다
        //여벌이있는친구가 도난당했으면 빌려줄 수 없다 .
        for (int i = 0; i <lost.length ; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i]==reserve[j]){
                    rent[j]=true;
                    lost[i]=-1;
                    answer++;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            int lostStu = lost[i];
            if(lostStu==-1) continue;
            for (int j = 0; j < reserve.length; j++) {

                int resStu= reserve[j];
                if(!rent[j] && Math.abs(lostStu-resStu)<=1){
                    answer++;
                    rent[j]=true;
                    break;
                }
            }   
        }
        return answer;
    }
}
