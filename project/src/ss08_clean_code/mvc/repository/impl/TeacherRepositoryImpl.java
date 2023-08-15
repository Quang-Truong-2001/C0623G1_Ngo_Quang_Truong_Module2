package ss08_clean_code.mvc.repository.impl;

import ss08_clean_code.mvc.model.Teacher;
import ss08_clean_code.mvc.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements ITeacherRepository<Teacher> {

    private static List<Teacher> teachers=new ArrayList<>();
    static {
        teachers.add(new Teacher("1","Nguyễn Văn A","2001","Nam","hóa"));
        teachers.add(new Teacher("2","Nguyễn Văn B","2001","Nam","hóa"));
        teachers.add(new Teacher("3","Nguyễn Văn C","2001","Nam","hóa"));
        teachers.add(new Teacher("4","Nguyễn Văn D","2001","Nam","hóa"));
    }

    @Override
    public void addInfoTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void deleteTeacher(String id) {
        for(int i=0;i< teachers.size();i++){
            if(teachers.get(i).getId().equals(id)){
                teachers.remove(teachers.get(i));
            }
        }
    }


    @Override
    public List<Teacher> displayAllTeacher() {
        return teachers;
    }
}
