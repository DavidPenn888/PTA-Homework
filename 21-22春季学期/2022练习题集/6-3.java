People()
        {}

        People(String id1,String name1)
        {
        id=id1;
        name=name1;
        }

        void setId(String newid)
        {
        id=newid;
        }
        void setName(String newname)
        {
        name=newname;
        }
        String getId()
        {
        return id;
        }
        String getName()
        {
        return name;
        }
public void say()
        {
        if(name=="Wang Wu")
        System.out.println("I'm a student. My name is "+name+".");
        else
        System.out.println("I'm a person! My name is "+name+".");
        }