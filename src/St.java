//7
public class St {
    public String nam;
    public int id;

    public St(String nam, int id) {
        this.nam = nam;
        this.id = id;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "St{" +
                "nam='" + nam + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        St [] ty=new St[4];
        ty[0]=new St("fg",9);
        ty[1]=new St("yy",8);
        ty[2]=new St("o",7);
        for (int i = 0; i <ty.length ; i++) {
            System.out.println(ty[i]);

        }
    }
}

