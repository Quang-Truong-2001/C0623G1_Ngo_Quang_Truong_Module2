package ss08_clean_code.mvc.repository;

import ss10_danh_sach.luyentap.main.Student;

public interface IStudentReponsitory {
    void add(int select);
    void delete(int select);
    void displaylist(int select);
}
