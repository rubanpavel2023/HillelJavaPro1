public class Employee {
    private String Name;
    private String Post;
    private String E_mail;
    private String Telephone;
    private String Age;

    protected Employee (String NewName, String NewPost, String NewE_mail, String NewTelephone, String NewAge){
        this.Name = NewName;
        this.Post = NewPost;
        this.E_mail = NewE_mail;
        this.Telephone = NewTelephone;
        this.Age = NewAge;
    }
}
