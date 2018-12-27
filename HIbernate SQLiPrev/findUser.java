 public List<LoginInfo>(String userName,String password){
 Query q = sessionFactory.getCurrentSession().createQuery("from LoginInfo where userName = :userName AND password =: password");    

 q.setParameter("name", userName);
 q.setParameter("password",password) 
List<LoginInfo> loginList = q.list(); 
return loginList;
}

