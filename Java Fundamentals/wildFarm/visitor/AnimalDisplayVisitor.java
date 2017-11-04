package wildFarm.visitor;

import wildFarm.animals.Cat;
import wildFarm.animals.Mouse;
import wildFarm.animals.Tiger;
import wildFarm.animals.Zebra;

public class AnimalDisplayVisitor extends Visitor {
    @Override
    public void visit(Cat cat) {
        System.out.println(cat.toString());
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println(tiger.toString());
    }

    @Override
    public void visit(Zebra zebra) {
        System.out.println(zebra.toString());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println(mouse.toString());
    }
}
