package com.example.sugad21.game_state;

public class GameState {

    GameState stateNew = new GameState();
    private int totalCards;
    private int handCount1;
    private int handCount2;
    private int handCount3;
    private int handCount4;
    private int handCount5;
    private boolean turnPhase;
    private boolean placementPhase;
    private boolean setupPhase;
    private int sumTrashCards;
    private int numPlayers;
    private int playerScore1;
    private int playerScore2;
    private int playerScore3;
    private int playerScore4;
    private int playerScore5;

    public GameState() {
        totalCards = 50;
        handCount1 = 10;
        handCount2 = 10;
        handCount3 = 10;
        handCount4 = 10;
        handCount5 = 10;
        numPlayers = 5;
        turnPhase = true;
        placementPhase = true;
        setupPhase = true;
        sumTrashCards = 52 - totalCards;
        playerScore1 = 0;
        playerScore2 = 0;
        playerScore3 = 0;
        playerScore4 = 0;
        playerScore5 = 0;
    }
   public GameState(GameState in){
        stateNew = in.stateNew;
   }

    public int getTotalCards(){
        return totalCards;
    }
    public int getPlayerScore1() {
        return playerScore1;
    }
    public int getPlayerScore2(){
        return playerScore2;
    }
    public int getPlayerScore3(){
        return playerScore3;
    }
    public int getPlayerScore4(){
        return playerScore4;
    }
    public int getPlayerScore5(){
        return playerScore5;
    }
    public int getSumTrashCards() {
        return sumTrashCards;
    }
    public int getNumPlayers(){
        return numPlayers;
    }

    public boolean getTurnPhase() {
        return turnPhase;
    }

    public boolean getPlacementPhase() {
        return placementPhase;
    }

    public boolean getSetupPhase() {
        return setupPhase;
    }
    public void setTotalCards(int in){
        totalCards = in;
    }
    public void setPlayerScore1(int in) {
        playerScore1 = in;
    }
    public void setPlayerScore2(int in){
        playerScore2 = in;
    }
    public void setPlayerScore3(int in){
        playerScore3 = in;
    }
    public void setPlayerScore4(int in){
        playerScore4 = in;
    }
    public void setPlayerScore5(int in){
        playerScore5 = in;
    }
    public void setSumTrashCards(int in) {
        sumTrashCards = in;
    }
    public void setNumPlayers(int in){
        numPlayers = in;
    }

    public void setTurnPhase(boolean in) {
        turnPhase = in;
    }

    public void setPlacementPhase(boolean in) {
        placementPhase = in;
    }

    public void setSetupPhase(boolean in) {
        setupPhase = in;
    }
}
