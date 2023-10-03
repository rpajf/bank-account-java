package ClassesFundamentals.Intro;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
    // record header -> record of components
    // for each component on the header
    // is generated a field with the same name and declared type as
    // the record component
    // the field is declared private and final(cannot be changed)

}
