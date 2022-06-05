int n = sc.nextInt();
        Object []a = new Object[n];
        for(int i=0; i<n; i++) {
        String l = sc.next();
        char k = l.charAt(0);
        switch (k) {
        case 'c' :{
        a[i] = new Computer();
        break;
        }
        case 'd' :{
        double n1 = sc.nextDouble();
        a[i] = n1;
        break;
        }
        case 'i' :{
        int n2 = sc.nextInt();
        a[i] = n2;
        break;
        }
        case 's' :{
        String n3 = sc.next();
        a[i] = n3;
        break;
        }
default:{
        a[i] = null;
        break;
        }
        }
        }
        for(int i=n-1 ;i>=0; i--) {
        if(a[i]==null)
        continue;
        System.out.println(a[i]);
        }


