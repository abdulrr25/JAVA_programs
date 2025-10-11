package com.demo.dao;
import java.time.LocalDate;

import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;

import com.demo.beans.Student;
import java.util.Optional;
import java.util.stream.Collectors;


public class StudentDaoImpl implements StudentDao{


static Set<Student> sset;
static{sset=new HashSet<>();
sset.add(new Student(7,"shruti",92,LocalDate.of(2021,04,21)));
sset.add(new Student(2,"Rishabh",76,LocalDate.of(2011,05,21)));
sset.add(new Student(5,"Aviraj",64,LocalDate.of(2024,12,23)));
sset.add(new Student(1,"Ansh",85,LocalDate.of(2021,03,21)));
sset.add(new Student(4,"Ali",89,LocalDate.of(2023,01,21)));
sset.add(new Student(3,"Anshul",75,LocalDate.of(2021,03,21)));

}
@Override
public boolean AddNewStudent(Student s) {
	// TODO Auto-generated method stub
	return sset.add(s);
	
	
}
@Override
public Set<Student> DisplayAll() {
	// TODO Auto-generated method stub
	return sset;
}
@Override
public Student findStudentById(int srollno) {
	// TODO Auto-generated method stub
	Optional<Student> op =sset.stream().filter(s->s.getRollno()==srollno).findFirst();
	if(op.isPresent()) {
		return op.get();
	}
	return null;
}
@Override
public Set<Student> findStudentbyName(String sname) {
	// TODO Auto-generated method stub
	Set<Student> ss =sset.stream().filter(s->s.getSname().equals(sname)).collect(Collectors.toSet());
	if(ss.size()>0) {
		return ss;

}
	return null;
}
@Override
public boolean ModifyPercentage(int srollno, double sper) {
	// TODO Auto-generated method stub
	Student s = findStudentById(srollno);
	if(s!=null) {
		s.setPercentage(sper);
		return true;
	}
	
	return false;
}
@Override
public boolean RemoveRecordById(int rollno) {
	// TODO Auto-generated method stub
	return sset.remove(new Student(rollno));
}
@Override
public boolean RemoveByPercentage(double percentage) {
	// TODO Auto-generated method stub
	return sset.removeIf(e->e.getPercentage()>percentage);
}
@Override
public Set<Student> sortbypercentage() {
	// TODO Auto-generated method stub
	Set<Student> tset=new TreeSet<>();
	for(Student s:sset) {
		tset.add(s);
	}
	return tset;
}
@Override
public List<Student> sortByName() {
	Comparator<Student> c=(o1,o2)->{
		System.out.println("in name comparator "+o1.getSname()+"-----"+o2.getSname());
		return o1.getSname().compareTo(o2.getSname());
	};

	List<Student> slist=new ArrayList<>();
	for(Student s:sset) {
		slist.add(s);
	}
	slist.sort(c);
	return slist;
}
@Override
public List<Student> sortByRollNo() {
	// TODO Auto-generated method stub
	Comparator<Student> c =(o1,o2)->{
		System.out.println("In ID COMPARATOR "+o1.getRollno()+"----------"+o2.getRollno());
		return o1.getRollno()-o2.getRollno();	
		
	};
	List<Student> slist = new ArrayList<>();
	for(Student s :sset) {
		slist.add(s);
	}
	slist.sort(c);
	return slist;
}
@Override
public Set<Student> sortByPercentage(double percentage) {
	// TODO Auto-generated method stub
	Set<Student> ss = sset.stream().filter(s->s.getPercentage()==percentage).collect(Collectors.toSet());
	return ss;
}

}

