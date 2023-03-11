package FinalProject;

import FinalProject.controller.Controller;
import FinalProject.model.*;
import FinalProject.model.contacts.ContactMenu;
import FinalProject.model.contacts.ContactMenuImpl;
import FinalProject.model.help.HelpMenu;
import FinalProject.model.help.HelpMenuImpl;
import FinalProject.model.mapper.MapperImpl;
import FinalProject.view.UserView;

public class Main {
    public static void main(String[] args) {
        BaseLogger logger = new Logger("notesLogger");
        FileOperations fileOperations = new FileOperationsImpl("notes.txt");
        Utils utils = new Utils();
        Repo repository = new RepoImpl(fileOperations, new MapperImpl(), utils, logger);
        HelpMenu help = new HelpMenuImpl();
        ContactMenu contacts = new ContactMenuImpl();
        Controller controller = new Controller(repository, help, contacts);
        UserView view = new UserView(controller);
        view.start();
    }
}
