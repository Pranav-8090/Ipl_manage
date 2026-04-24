package lpl_manage2026;

public class PlayerService {

    PlayerDao dao;

    public PlayerService() throws Exception {
        dao = new PlayerDao();
    }

    
    public void getAllPlayers() throws Exception {
        dao.getAllPlayers();
    }

    
    public void getBatsmen() throws Exception {
        dao.getBatsmen();
    }

    
    public void getBowlers() throws Exception {
        dao.getBowlers();
    }

    
    public void getPlayerById(int id) throws Exception {
        if (id <= 0) {
            System.out.println("❌ Invalid ID");
            return;
        }
        dao.getPlayerById(id);
    }

   
    public void getPlayersByTeam(String team) throws Exception {
        dao.getPlayersByTeam(team);
    }

   
    public void highestScore() throws Exception {
        dao.highestScore();
    }

    
    public void maxWickets() throws Exception {
        dao.maxWickets();
    }

   
    public void top5Scores() throws Exception {
        dao.top5Scores();
    }

   
    public void updateScore(int id, int score) throws Exception {
        if (score < 0) {
            System.out.println("❌ Score cannot be negative");
            return;
        }
        dao.updateScore(id, score);
    }

   
    public void updatePlayer(Player p) throws Exception {
        dao.updatePlayer(p);
    }

    
    public void deletePlayer(int id) throws Exception {
        dao.deletePlayer(id);
    }

   
    
    
    public void addPlayer(Player p) throws Exception {
        dao.addPlayer(p);
    }

    
    
    
    public void sortByName() throws Exception {
        dao.sortByName();
    }

    
    
    public void sortByScoreDesc() throws Exception {
        dao.sortByScoreDesc();
    }

    public void teamAndCategory(String team, String category) throws Exception {
        dao.teamAndCategory(team, category);
    }
}