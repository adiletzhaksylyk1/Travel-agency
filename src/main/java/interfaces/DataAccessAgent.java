package interfaces;
import java.util.List;
import models.Agent;
public interface DataAccessAgent {
    void insertAgent(Agent agent);
    Agent findAgentById(int agentId);
    List<Agent> findAllAgents();
    boolean updateAgent(Agent agent);
    boolean deleteAgent(int agentId);
}
