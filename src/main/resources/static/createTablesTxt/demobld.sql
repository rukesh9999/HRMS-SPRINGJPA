
DROP TABLE BONUS;
DROP TABLE EMPLOYEE;
DROP TABLE EMP_SALARY;
DROP TABLE EMP_LEAVES;
DROP TABLE EMP_PROJECTS;
DROP TABLE EMP_PerformanceAndReviews;
DROP TABLE RecruitedCandidates;
CREATE TABLE EMP_PerformanceAndReviews(
        EmployeeNo            VARCHAR2(24),
        Communication         VARCHAR2(25),
        CodingSkills          VARCHAR2(25),
        Leadership            VARCHAR2(25),
        Teamwork              VARCHAR2(25),
        GoalSetting           VARCHAR2(25),
        Timemanagement        VARCHAR2(25),
        Attendance            VARCHAR2(25),
        OverallPerformance    VARCHAR2(25),
        TypeofBand            VARCHAR2(25) );

CREATE TABLE EMPLOYEE(
   EmpNo         VARCHAR2(24),
   EmpName       VARCHAR2(255),
   Salary        NUMBER(24),
   Department    VARCHAR2(255),
   HireDate      DATE,
   EmailId       VARCHAR2(255),
   Username      VARCHAR2(255),
   Password      VARCHAR2(255)
);

CREATE TABLE RecruitedCandidates(      
         FullName          VARCHAR2 (255) ,
	 YearOFPassedOut   NUMBER(25),
	 Percentage        NUMBER(25),
	 Branch            VARCHAR2(25));


 

CREATE TABLE EMP_SALARY(
        EMPNO             VARCHAR2(255) ,
        BASIC_SALARY      NUMBER(25),
        HRA               NUMBER(25),
        OTHER_ALLOWANCES  NUMBER(25),
        GROSS_SALARY      NUMBER(25),
        PF                NUMBER(25),
        CTC               NUMBER(25),
        Deductions        NUMBER(25),
        Net_Pay           NUMBER(25));



CREATE TABLE EMP_LEAVES(
        EMPNO             VARCHAR2(24) ,
        TYPE_OF_LEAVE     VARCHAR2(255),
        START_DATE        DATE,
        END_DATE          DATE,
        NO_OF_LEAVES      NUMBER(3));



CREATE TABLE EMP_PROJECTS(
        EMPNO               VARCHAR2(24),
        NAME_OF_THE_PROJECT VARCHAR2(255),
        TYPE_OF_PROJECT     VARCHAR2(255),
        START_DATE          DATE,
        END_DATE            DATE,
        STATUS              VARCHAR2(255));


CREATE TABLE BONUS
        (ENAME VARCHAR2(10),
         JOB   VARCHAR2(9),
         SAL   NUMBER,
         COMM  NUMBER);


COMMIT;

