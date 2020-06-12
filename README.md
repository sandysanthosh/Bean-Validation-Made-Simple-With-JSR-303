# Bean-Validation-Made-Simple-With-JSR-303:

### Pom.xml:

      <dependency>
          <groupId>javax.validation</groupId>
          <artifactId>validation-api</artifactId>
          <version>1.0.0.GA</version>
      </dependency>



#### Facebook:

            To Register
            firstname
            lastname
            gender
            email
            dateofbirth
      
crate a java bean named as Member
gender is enum
all are strings
date date

#### Add jars:

    hibernate-validator-4.2.0.Final.jar
    hibernate-validator-annotation-processor-4.2.0.Final.jar
    slf4j-api-1.6.1.jar
    validation-api-1.0.0.GA.jar

#### you simply annotation the 'MEMBER':

    ->properties need to validate->which properties need to be added
    ->you can annotate either fields or accessor(or getters) methods to java bean
    ->memeber.java
    ->pojo

      private string firstname =null; 
      private string lastname=null; 
      private Gender gender=null;
      private string email=null;
      private Date date =null;

  public member() {

    @NotNull(message = " firstname is compulsary")
    @NotBlank(message = " firstname is compulsary")
    @pattern(regexp="[a-zA-Z]*" message = " firstname is compulsary")
    public string getFirstname() { reurn FirstName; }
    @Past(message="Date of birth must be the past") @NotNull public Date getDate() { return FirstName; }
    @Min(value=18 ,Message="Age must be greater than or equal to 18") @Max(value=150 ,Message="Age must be less than 150") public Integer getAge(){ //caluclate the age } return null; } }
    @NotNull(message ="Email Address is compulsary") @NotBlank(message="Email Address is compulsary") 
    @Email(message="Email address is not a valid format") public string getEmailAddress(){ return email; }

    Min,Max,Email,Past,NotNull,NotBlank,Pattern
    value,message,regexp

To test the value use the unit testing:

#### main class:

        public class main { public static void main(String args[]) {
        Member g = new Member();
        Scanner sc = new Scanner(System.in);
        g.setFirstName(sc.next());

          `System.out.println(g.getFirstName());`
        `}`
        }
