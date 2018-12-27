# SQLI Preventions


Repository made for preventing sql injections. It can open up to inumerous frameworks and tecnologies


Example:
<h3>Hibernate Username and passsword SQLI prevention
<hr>
   <br>
   
     public List<LoginInfo>(String username){
     Query q = sessionFactory.getCurrentSession().createQuery("from LoginInfo where userName = :name");    
  
     q.setParameter("name", userName); 
    List<LoginInfo> loginList = q.list(); 
    return loginList;
    }
</br>
<hr>
