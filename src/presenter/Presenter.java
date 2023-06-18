package presenter;

import tree.Service;
import tree.human.Human;
import view.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(Human human) {
        service.addHuman(human);
    }

    public void getHumanList() {
        String humanList = service.getHumanList();
        view.print(humanList);
    }

    public void sortByFirstName(){
        service.sortByFirstName();
        getHumanList();
    }
    public void sortByLastName(){
        service.sortByLastName();
        getHumanList();
    }

}
