package model;

public class essentialFactor {
    int IQ,EQ,constitution,memory,imagination,charm,knowledge,action,face,stress, satisfaction,potential,IQRate,EQRate,constitutionRate,memoryRate,imaginationRate,charmRate,times,turn;

    public essentialFactor(int IQ, int EQ, int constitution, int memory, int imagination, int charm, int knowledge, int action, int face, int stress, int satisfaction, int potential, int IQRate, int EQRate, int constitutionRate, int memoryRate, int imaginationRate, int charmRate, int times, int turn) {
        this.IQ = IQ;
        this.EQ = EQ;
        this.constitution = constitution;
        this.memory = memory;
        this.imagination = imagination;
        this.charm = charm;
        this.knowledge = knowledge;
        this.action = action;
        this.face = face;
        this.stress = stress;
        this.satisfaction = satisfaction;
        this.potential = potential;
        this.IQRate = IQRate;
        this.EQRate = EQRate;
        this.constitutionRate = constitutionRate;
        this.memoryRate = memoryRate;
        this.imaginationRate = imaginationRate;
        this.charmRate = charmRate;
        this.times = times;
        this.turn = turn;
    }

    public int getIQ() {
        return IQ;
    }

    public int getEQ() {
        return EQ;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getMemory() {
        return memory;
    }

    public int getImagination() {
        return imagination;
    }

    public int getCharm() {
        return charm;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getAction() {
        return action;
    }

    public int getFace() {
        return face;
    }

    public int getStress() {
        return stress;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public int getPotential() {
        return potential;
    }

    public int getIQRate() {
        return IQRate;
    }

    public int getEQRate() {
        return EQRate;
    }

    public int getConstitutionRate() {
        return constitutionRate;
    }

    public int getMemoryRate() {
        return memoryRate;
    }

    public int getImaginationRate() {
        return imaginationRate;
    }

    public int getCharmRate() {
        return charmRate;
    }

    public int getTimes() {
        return times;
    }

    public int getTurn() {
        return turn;
    }
/*    public void setIQ(int IQ) {this.IQ = IQ;}

    public void setEQ(int EQ) {
        this.EQ = EQ;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setImagination(int imagination) {
        this.imagination = imagination;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public void setStress(int stress) {
        this.stress = stress;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }

    public void setIQRate(int IQRate) {
        this.IQRate = IQRate;
    }

    public void setEQRate(int EQRate) {
        this.EQRate = EQRate;
    }

    public void setConstitutionRate(int constitutionRate) {
        this.constitutionRate = constitutionRate;
    }

    public void setMemoryRate(int memoryRate) {
        this.memoryRate = memoryRate;
    }

    public void setImaginationRate(int imaginationRate) {
        this.imaginationRate = imaginationRate;
    }

    public void setCharmRate(int charmRate) {
        this.charmRate = charmRate;
    }

    public void setT (int times) {
        this.times = times;
    }*/

    public void minusTimes(int minusTimes){this.times = times - minusTimes;}
    public void minusKnowledge(int minusKnowledge){this.knowledge=knowledge - minusKnowledge;}
    public void addMemory(int addMemory){this.memory = memory + addMemory;}
    public void addIQ(int addIQ){this.IQ = IQ + addIQ;}
    public void addEQ(int addEQ){this.EQ = EQ + addEQ;}
    public void addImagination(int addImagination){this.imagination = imagination + addImagination;}
    public void addConstitution(int addConstitution){this.constitution = constitution + addConstitution;}
    public void addMemoryE(int addMemoryE){this.memoryRate = memoryRate + addMemoryE;}
    public void addIQE(int addIQE){this.IQRate = IQRate + addIQE;}
    public void addEQE(int addEQE){this.EQRate = EQRate + addEQE;}
    public void addImaginationE(int addImaginationE){this.imaginationRate = imaginationRate + addImaginationE;}
    public void addConstitutionE(int addConstitutionE){this.constitutionRate = constitutionRate + addConstitutionE;}
    public void addKnowledge(int addKnowledge){this.knowledge=knowledge + addKnowledge;}
    public void addAction(int addAction){this.action = action + addAction;}
    public void minusAction(int minusAction){this.action=action - minusAction;}

    public static void addAttr(String[] toBA, essentialFactor ef) {
        switch (toBA[1]) {
            case "1" -> ef.addIQ(Integer.parseInt(toBA[2]));
            case "2" -> ef.addEQ(Integer.parseInt(toBA[2]));
            case "3" -> ef.addImagination(Integer.parseInt(toBA[2]));
            case "4"-> ef.addMemory(Integer.parseInt(toBA[2]));
            case "5" -> ef.addConstitution(Integer.parseInt(toBA[2]));
            case "6" -> ef.addIQE(Integer.parseInt(toBA[2]));
            case "7" -> ef.addEQE(Integer.parseInt(toBA[2]));
            case "8" -> ef.addImaginationE(Integer.parseInt(toBA[2]));
            case "9" -> ef.addMemoryE(Integer.parseInt(toBA[2]));
            case "10" -> ef.addConstitutionE(Integer.parseInt(toBA[2]));
            case "11" -> ef.addKnowledge(Integer.parseInt(toBA[2]));
            case "12" -> ef.addAction(Integer.parseInt(toBA[2]));
        }
    }

    public void nextTurn() {
        this.IQ += this.IQRate;
        this.EQ += this.EQRate;
        this.imagination += this.imaginationRate;
        this.memory += this.memoryRate;
        this.constitution += this.constitutionRate;
        this.action += 100;
        this.turn += 1;
        this.face += 3;
    }

}
