package lpl_manage2026;


public class Player {

    private int pid;
    private String name;
    private String teamName;
    private String category;
    private int score;
    private int catches;
    private int wickets;

    public Player() {}



    public Player(int pid, String name, String teamName, String category,
                  int score, int catches, int wickets) {
        this.pid = pid;
        this.name = name;
        this.teamName = teamName;
        this.category = category;
        this.score = score;
        this.catches = catches;
        this.wickets = wickets;
    }



    public int getPid() { return pid; }
    public String getName() { return name; }
    public String getTeamName() { return teamName; }
    public String getCategory() { return category; }
    public int getScore() { return score; }
    public int getCatches() { return catches; }
    public int getWickets() { return wickets; }

    
    public void setPid(int pid) { this.pid = pid; }
    public void setName(String name) { this.name = name; }
    public void setTeamName(String teamName) { this.teamName = teamName; }
    public void setCategory(String category) { this.category = category; }
    public void setScore(int score) { this.score = score; }
    public void setCatches(int catches) { this.catches = catches; }
    public void setWickets(int wickets) { this.wickets = wickets; }


    @Override
    public String toString() {
        return pid + " | " + name + " | " + teamName + " | " + category +
               " | " + score + " | " + catches + " | " + wickets;
    }
}