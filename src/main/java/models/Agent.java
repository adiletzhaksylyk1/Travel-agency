package models;

public class Agent {
    private int agentId;
    private String name;
    private String email;
    private String phoneNumber;

    public Agent() {
    }

    public Agent(int agentId, String name, String email, String phoneNumber) {
        this.agentId = agentId;
        this.name = name;
        this.email = email;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAgentId() {
        return agentId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Agent: " + agentId +
                " " + name + '\'' +
                " email: " + email;
    }
}

