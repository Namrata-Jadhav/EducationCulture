package JavaAssignment;

import JavaAssignment.CSE;

public class EducationSystem {
    public static void main(String[] args) {
       Graduation gd = new Graduation();
       gd.streams();
       gd.HSCPercentage();
       gd.AgeCriteria();
       Engineering en = new Engineering();
       en.streams();
       en.typeOfEngineering();
       CSE cs = new CSE();
       cs.HSCPercentage();
       cs.Subjects();
    }
}
