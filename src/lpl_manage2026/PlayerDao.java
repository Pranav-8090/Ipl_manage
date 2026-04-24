package lpl_manage2026;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDao {

    Connection con;

    public PlayerDao() {
        con = DBConnection.getConnection();
    }

    // 1. Get All Players
    public void getAllPlayers() throws Exception {
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM player");
        while (rs.next()) print(rs);
    }

    // 2. Get Batsmen
    public void getBatsmen() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player WHERE category='Batsman'");
        while (rs.next()) print(rs);
    }

    // 3. Get Bowlers
    public void getBowlers() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player WHERE category='Bowler'");
        while (rs.next()) print(rs);
    }

    // 4. Get Player by ID
    public void getPlayerById(int id) throws Exception {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM player WHERE pid=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) print(rs);
    }

    // 5. Get Players by Team
    public void getPlayersByTeam(String team) throws Exception {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM player WHERE team_name=?");
        ps.setString(1, team);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) print(rs);
    }

    // 6. Highest Score Player
    public void highestScore() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player ORDER BY score DESC LIMIT 1");
        while (rs.next()) print(rs);
    }

    // 7. Max Wickets Player
    public void maxWickets() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player ORDER BY wickets DESC LIMIT 1");
        while (rs.next()) print(rs);
    }

    // 8. Top 5 Players by Score
    public void top5Scores() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player ORDER BY score DESC LIMIT 5");
        while (rs.next()) print(rs);
    }

    // 9. Update Score
    public void updateScore(int id, int score) throws Exception {
        PreparedStatement ps = con.prepareStatement(
                "UPDATE player SET score=? WHERE pid=?");
        ps.setInt(1, score);
        ps.setInt(2, id);
        ps.executeUpdate();
    }

    // 10. Update Full Player
    public void updatePlayer(Player p) throws Exception {
        PreparedStatement ps = con.prepareStatement(
                "UPDATE player SET name=?, team_name=?, category=?, score=?, catches=?, wickets=? WHERE pid=?");

        ps.setString(1, p.getName());
        ps.setString(2, p.getTeamName());
        ps.setString(3, p.getCategory());
        ps.setInt(4, p.getScore());
        ps.setInt(5, p.getCatches());
        ps.setInt(6, p.getWickets());
        ps.setInt(7, p.getPid());

        ps.executeUpdate();
    }

    // 11. Delete Player
    public void deletePlayer(int id) throws Exception {
        PreparedStatement ps = con.prepareStatement("DELETE FROM player WHERE pid=?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    // 12. Add Player
    public void addPlayer(Player p) throws Exception {
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO player VALUES (?,?,?,?,?,?,?)");

        ps.setInt(1, p.getPid());
        ps.setString(2, p.getName());
        ps.setString(3, p.getTeamName());
        ps.setString(4, p.getCategory());
        ps.setInt(5, p.getScore());
        ps.setInt(6, p.getCatches());
        ps.setInt(7, p.getWickets());

        ps.executeUpdate();
    }

    // 13. Sort by Name
    public void sortByName() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player ORDER BY name ASC");
        while (rs.next()) print(rs);
    }

    // 14. Sort by Score Desc
    public void sortByScoreDesc() throws Exception {
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM player ORDER BY score DESC");
        while (rs.next()) print(rs);
    }

    // 15. Filter by Team & Category
    public void teamAndCategory(String team, String category) throws Exception {
        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM player WHERE team_name=? AND category=?");

        ps.setString(1, team);
        ps.setString(2, category);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) print(rs);
    }

    // 🔹 Helper Method
    private void print(ResultSet rs) throws Exception {
        System.out.println(
                rs.getInt("pid") + " | " +
                rs.getString("name") + " | " +
                rs.getString("team_name") + " | " +
                rs.getString("category") + " | " +
                rs.getInt("score") + " | " +
                rs.getInt("catches") + " | " +
                rs.getInt("wickets")
        );
    }
}