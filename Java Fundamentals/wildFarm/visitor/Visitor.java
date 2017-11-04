package wildFarm.visitor;

import wildFarm.animals.Cat;
import wildFarm.animals.Mouse;
import wildFarm.animals.Tiger;
import wildFarm.animals.Zebra;

public abstract class Visitor {
    public abstract void visit(Cat cat);
    public abstract void visit(Tiger tiger);
    public abstract void visit(Zebra zebra);
    public abstract void visit(Mouse mouse);
}
