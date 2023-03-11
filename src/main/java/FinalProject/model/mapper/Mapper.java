package FinalProject.model.mapper;

import FinalProject.model.Note;

public interface Mapper {

    String map(Note note);

    Note map(String line);

}

