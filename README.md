# SQLI Preventions


Repository made for preventing sql injections. It can open up to inumerous frameworks and tecnologies


Example:

   Query q = sessionFactory.getCurrentSession().createQuery("from LoginInfo where userName = :name");
    q.setParameter("name", userName);
    List<LoginInfo> loginList = q.list();
