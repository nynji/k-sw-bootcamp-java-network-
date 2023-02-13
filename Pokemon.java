import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Pokemon {
    private String owner;  //private 로 바꾸고 getter setter 사용하기
    private List<String> skills;
    public static int count = 0;

    public String getOwner() {
        return owner;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Pokemon(String owner, String skills) {
        this.owner = owner;
        StringTokenizer st = new StringTokenizer(skills, "/");
        this.skills = new ArrayList<>();
        while(st.hasMoreTokens()){
            this.skills.add(st.nextToken());
        }
        System.out.print("포켓몬 생성 : ");
        Pokemon.count = Pokemon.count + 1;
    }

    public void attack(int idx){
        System.out.println(this.skills.get(idx) + "공격 시전!");
    }
    public void info(){
        int idx = 0;
        System.out.println(this.owner + "의 포켓몬이 사용 가능한 스킬");
        for(String skill : skills){
            System.out.println(++idx + " : " + skill);
        }
    }
}
