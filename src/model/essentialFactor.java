package model;

public class essentialFactor {
    int IQ,EQ,constitution,memory,imagination,charm,knowledge,action,face,stress, satisfaction,potential,IQRate,EQRate,constitutionRate,memoryRate,imaginationRate,charmRate,times;

    public essentialFactor(int IQ, int EQ, int constitution, int memory, int imagination, int charm, int knowledge, int action, int face, int stress, int satisfaction, int potential, int IQRate, int EQRate, int constitutionRate, int memoryRate, int imaginationRate, int charmRate, int times) {
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

    public void setIQ(int IQ) {this.IQ = IQ;}

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
    }

    //request里面减少次数
    public void minusTimes(int minusTimes){this.times = times - minusTimes;}

    //study里面修改属性
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

}
