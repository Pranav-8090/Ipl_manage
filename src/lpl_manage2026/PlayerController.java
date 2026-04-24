package lpl_manage2026;



public class PlayerController {

    PlayerService service;

    public PlayerController() throws Exception {
        service = new PlayerService();
    }

    public void getAllPlayers() throws Exception {
        service.getAllPlayers();
    }

    public void getBatsmen() throws Exception {
        service.getBatsmen();
    }

    public void getBowlers() throws Exception {
        service.getBowlers();
    }

    public void getPlayerById(int id) throws Exception {
        service.getPlayerById(id);
    }

    public void getPlayersByTeam(String team) throws Exception {
        service.getPlayersByTeam(team);
    }

    public void highestScore() throws Exception {
        service.highestScore();
    }

    public void maxWickets() throws Exception {
        service.maxWickets();
    }

    public void top5Scores() throws Exception {
        service.top5Scores();
    }

    public void updateScore(int id, int score) throws Exception {
        service.updateScore(id, score);
    }

    public void updatePlayer(Player p) throws Exception {
        service.updatePlayer(p);
    }

    public void deletePlayer(int id) throws Exception {
        service.deletePlayer(id);
    }

    public void addPlayer(Player p) throws Exception {
        service.addPlayer(p);
    }

    public void sortByName() throws Exception {
        service.sortByName();
    }

    public void sortByScoreDesc() throws Exception {
        service.sortByScoreDesc();
    }

    public void teamAndCategory(String team, String category) throws Exception {
        service.teamAndCategory(team, category);
    }
}