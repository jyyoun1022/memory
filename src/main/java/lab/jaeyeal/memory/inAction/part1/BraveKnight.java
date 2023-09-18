package lab.jaeyeal.memory.inAction.part1;

public class BraveKnight implements Knight{

    private Quest quest;
    private Minstrel minstrel;

    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
