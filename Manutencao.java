import java.awt.Color;

import javax.swing.JPanel;

//import sun.swing.text.UndoableEditLockSupport;

public class Manutencao{
    private int id;
    private String description;
    private String client;
    private double value;
    private double valueExpense;
    private boolean paid;
    private String historicExpense;
    private String receivingDate;
    private boolean returned;
    private String equipment;
    public static JPanel panelRegister = new JPanel();

    public Manutencao(){
        registerM();
    }
    public Manutencao(int id, String description, String client, double value, double valueExpense, boolean paid, String historicExpense, String receivingDate,boolean returned, String equipment){
        this.id = id;
        this.description = description;
        this.client = client;
        this.value = value;
        this.valueExpense = valueExpense;
        this.historicExpense = historicExpense;
        this.receivingDate = receivingDate;
        this.returned = returned;
        this.equipment = equipment;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getClient(){
        return client;
    }
    public void setClient(String client){
        this.client = client;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public double getValueExpense(){
        return valueExpense;
    }
    public void setValuleExpense(double valueExpense){
        this.valueExpense = valueExpense;
    }
    public boolean getPaid (){
        return paid;
    }
    public void setPaid(boolean paid){
        this.paid = paid;
    }
    public String getHistoricExpense(){
        return historicExpense;
    }
    public void setHistoricExpense(String historicExpense){
        this.historicExpense = historicExpense;
    }
    public String getReceivingDate(){
        return receivingDate;
    }
    public void setReceivingDate(String receivingDate){
        this.receivingDate = receivingDate;
    }
    public boolean getReturned(){
        return returned;
    }
    public void setReturned(){
        this.returned = returned;
    }
    public String getEquipment(){
        return equipment;
    }
    public void setEquipment(String equipment){
        this.equipment = equipment;
    }
    public void registerM (){
        panelRegister.setVisible(true);
        panelRegister.setLayout(null);
        panelRegister.setBackground(Color.RED);
        panelRegister.setBounds(200,0,1500,1000);
    }
    /*public static void main(String [] args){
        registerM();
    }*/
}
