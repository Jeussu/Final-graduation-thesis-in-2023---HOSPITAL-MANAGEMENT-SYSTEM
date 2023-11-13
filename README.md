<h1>Final graduation thesis in 2023 - HOSPITAL MANAGEMENT SYSTEM</h1>


![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/914911f3-b2e5-4138-b632-2c57a8993ef1)


ACKNOWLEDGEMENTS
I am grateful to Dr. Do Hong Quan for being an excellent supervisor during the development of our work. His thoughtful advice and mentorship are priceless, and they have benefited me in broadening my professional knowledge.

REPORT ORGANIZATION
This report will include a literature review, in-depth research on the topic, and an assessment of the technologies and methodologies to be applied. Following that, a comparison of similar contemporary apps will be made. The project's functional and non-functional needs, as well as their priority, will then be defined. The system's design, which includes all of the application's design requirements, will be described in the following chapter. After that, the documentation for the application's implementation and the implementation procedure will be released. Following that, a test plan will conduct a systematic evaluation. Finally, the deployed system will be subjected to critical reflection and future enhancement. The following is a list of the contents of each chapter:

Chapter 1: This chapter provides the project's literature review, which looks at the problem and outlines possible technologies and methodologies.
Chapter 2: Compares and contrasts various hospital management systems, highlighting the benefits and drawbacks of comparable platforms. A thorough requirements study is also included, which identifies functional and non-functional needs and their priority.
Chapter 3: This chapter delves into the system's design in great depth and numerous diagrams. 
Chapter 4: The implementation of the project, including the technology, is discussed in this chapter.
Chapter 5: The evaluation of the system is covered in this chapter, which includes screenshots of the design in action, a testing approach, test cases, and results.
Chapter 6: Examines the system and process in-depth and makes recommendations for future project improvements.  

1 Introduction 
A hospital management system is an essential but frequently undervalued tool utilized by most institutions in medical science. There should be no hospital that does not have a hospital management system, yet this is not the case. A hospital management system is often complicated for small or new hospitals to afford. As a result, this project aims to create and distribute a free hospital management system that any hospital can use. Although unusual requests will be handled through the comments section, the system's operation will be uniform across all hospitals. The data needed to create a hospital management system will be gathered through a thorough and rigorous evaluation detailed in this study.
2 Literature Review 
2.1 Hospital management system 
A hospital is a facility that provides medical care to those ill. Technology has advanced tremendously in many areas this century, most notably in telecommunications, while the health industry has lagged in digitalization. Except in emergencies, where every second counts, the current health system is undeniably functional and battle-tested. As a result, a better strategy is required. Patients' information, such as reports, previous illnesses, or infections, should be maintained on a considerable system accessible to field experts (mainly doctors) worldwide. This data can be stored on a database server. (World Health Organization, 2019). 
Patients' critical information is recorded into the system when they are admitted to the hospital. After a doctor's prescription, it is swiftly moved to other hospital areas, such as the Pharmacy department, to acquire pharmaceuticals. Each patient can self-register on the internet, and they will be given an I.D. to utilize for future transactions and data analysis. Furthermore, bookkeeping tasks such as logging check-ups and recording patients' intermittent experiences are more efficient. Patients can also check their doctors' availability and receive updates, bringing the two parties closer together.
The best aspect is that, because of current smartphone usage, most individuals now have internet access. As a result, information diffusion and availability are greatly simplified. This will enable virtual medical services and help individuals who need life-saving medical procedures even more.
2.1.1 PROBLEM DOMAIN. 
The project Hospital Management system includes registration of patients, storing their details into the system, and also computerized billing in the pharmacy, and labs. The software has the facility to give a unique id for every patient and stores the details of every patient and the staff automatically. It includes a search facility to know the current status of each room. User can search availability of a doctor and the details of a patient using the id. 
The Hospital Management System can be entered using a username and password. It is accessible either by an administrator or receptionist. Only they can add data into the database. The data can be retrieved easily. The interface is very user-friendly. The data are well protected for personal use and makes the data processing very fast. (Rossana Rivas, Luis Vilcahuamán, July 17, 2017)
Hospital Management System is powerful, flexible, and easy to use and is designed and developed to deliver real conceivable benefits to hospitals. 

Hospital Management System is designed for multispeciality hospitals, to cover a wide range of hospital administration and management processes. It is an integrated end-toend Hospital Management System that provides relevant information across the hospital to support effective decision making for patient care, hospital administration and critical financial accounting, in a seamless flow. 

The hospital management system is one of the essential systems, the sooner information technology is incorporated, the higher the quality of healthcare that may be provided. According to the World Health Organization (WHO), the goal of a hospital management system is frequently reduced to the generation of high-quality data. The principal purpose is to make healthcare experts and contributors available to make informed treatment decisions based on facts. To summarize, to improve the health system's performance, hospital management decisions should be based on continually updated and processed data rather than quality, especially when responding to crises. (Edda Weimann, 2017) 
2.1.2 Electronic Health Record (EHR)
According to the World Health Organization (WHO): Electronic health records (EHRs) are real-time, patient-centered records that give authorized users immediate and secure information. EHRs often include a patient's medical history, diagnoses and treatments, medications, allergies, immunizations, radiology images, laboratory results, radiology pictures, and laboratory results. A National Electronic Health Records system is typically implemented under the direction of the national health authority, and it makes a patient's medical history available to health care professionals in health care institutions, as well as providing links to related services like pharmacies, laboratories, specialists, and emergency and medical imaging facilities. ( World Health Organization, 2015)
According to the World Health Organization (WHO), electronic medical records can be classified and divided into the following five levels:
Five Levels of Electronic Healthcare Records (EHR)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/264233ef-3449-4950-98bf-fe508d13bfad)
Figure 1:Five Levels of Electronic Healthcare Records (EHR)

Levels 1: AMR 50% of data is generated by computers, with a paper-based medical record and some automation in medical documentation (Order/Entry, Result Reporting, Communication, and Digital Recording).
Levels 2: CMR Scanning paper documents and importing digital files to create a digital medical record with a structure and view similar to a paper record, a paperless system with no OCR or ICR, and a pure image system.
Levels 3: EMR Data management, different views on the record, digital medical records embedded in IT-based organization support of clinical processes, documents solely IT generated, decision support and interactive guidelines, and connection with business and management data are all features of the digital medical record.
Levels 4: EPR Contains all a patient's disease-related data, can be established outside of an institution (regional), exceeds the scope of documenting duties inside a medical record, longitudinal projection, e.g., telemedicine, information systems research data networks
Levels 5: EHR Contains all of a person's health-related data, such as wellness, food-related, and other health-related information; is permanently established outside of an institutional framework (regional, national, global); web-based; involves citizen engagement in creating the record. 
2.1.3 Options for storing healthcare data
Data is becoming more of a problem for healthcare organizations. The volume of healthcare data in 2013 was 153 exabytes, according to a 2014 IDC research — one exabyte equals one billion gigabytes. By 2020, that figure is expected to rise to 2,314 exabytes. (healthdirect australia , 2020)
One of the most critical problems healthcare organizations must consider when confronted with this mountain of data — 80 percent of it is unstructured — is how to keep it all. While typical disk-based healthcare data storage may be sufficient for smaller businesses, larger hospitals or health systems may require solutions that can store terabytes or petabytes of data.
For enterprises that need to store massive volumes of data, there are a variety of alternatives available. Storage Area Networks (SAN) are still a popular alternative, but cloud-based hospital administration software is also a viable option.
Cloud Computing
Twenty-four percent of hospitals have moved their data storage to the Cloud. The Cloud environment is perfect for healthcare information management since it provides both storage and security and latency and privacy, according to the hospital's requirements. With the development of public, private, and hybrid Cloud models, hospitals can choose to keep some critical data on-premise while storing other data rarely accessed in the Cloud.
Storage Area Networks (SAN)
The SAN option is used by 67 percent of significant hospitals with more than 500 beds for data storage. A SAN is a high-speed data storage network that uses a dedicated fiber channel pipeline to connect various storage devices with associated data servers. As a result, photos and data can be sent straight from storage to workstations on the pipeline, freeing up resources on the central server. This frees up bandwidth and allows patient-related data to be transmitted more quickly.
The use of SAN to enable all PACS-(Picture Archiving and Communication Systems) has become highly vital as the requirement to communicate more diagnostic data has developed. (frontenders, 2020)

2.1.4MODULES: 
According to the World Health Organization (WHO), a hospital management system is a component of a medical and social organization to ensure that patients receive comprehensive medical treatment. Both therapeutic and preventative measures are taken. The hospital management system, which stores a considerable amount of patient and clinical data, is based on healthcare standards and criteria. A Hospital Management System (HMS) is software that helps a clinic's workflow be coordinated and controlled. HMS is in charge of the hospital's financial, administrative, legal, and medical elements.  (World Health Organization, 2020). Based on ISO 9000 of the Red Cross Hospital in Beverwijk, Netherlands, the following modules could be included in the system:
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/957219ad-ee50-4828-94f3-fba85638405b)
Figure 2: Hospital management system modules

Electronic patient data
Keeping track of a patient's medical condition. Medical visits, medicine lists, and laboratory results are all kept on file. They also show the date of the last doctor's visit and their phone number. The patient's personal information, such as name, passport, social security number, address, phone number, and email address, is stored. EHR or EMR subsystems fall within this group.
The system's data is updated regularly. Patients are registered, and medical history is kept in this module. The information acquired assists medical professionals in automatically notifying clients of appointments and sending discharge advice through email.

Information about doctors
The module maintains a list of available doctors for the days selected, controls their employment, and distributes time throughout the day. The patient can also see details about the specialist's education, qualifications, and experience. Choosing a doctor becomes a lot easier and faster due to this information.

Inventory of stocks and materials
The module gives data on the number of medications available and their location in pharmacies. The hospital management can check the fuel level in ambulances allocated to a medical facility or track the pharmaceuticals needed and order them at the purchase price. The method enables the entire company to purchase equipment and medical instruments. The clinic can control electricity, water, and utility expenses.

Interaction with clients
The administrative module is based on the CRM concept. Hospital employees can access customer contact information, service difficulties, and call history are accessible to hospital employees. Additionally, the subsystem allows you to contact patients to notify them of upcoming appointments or test results. The module aids in collecting client feedback and the improvement of hospital workflow.

Medical Services
This category covers tools for scheduling and physiotherapy appointments and hospital admissions and discharge procedures. The module aids in selecting diet-friendly foods, the menu of a hospital cafe, and the management of surgical room availability.

Financial transactions and reporting
A patient uses a unique code to pay for a specific medical service. The system generates an invoice depending on the amount of time spent in the hospital and the treatments performed. It communicates with third-party technologies such as a payment gateway to transmit funds. The information regarding money transactions and client data is recorded in reports generated automatically.

2.2 Hospital Management Software Faces Difficulties
According to the World Health Organization(WHO), during the covid-19 epidemic, the demand for health care services increased significantly. Most hospitals find it necessary to deploy new systems, posing problems and limiting HMIS implementation. This means that HMIS requirements will alter as well, utilizing the power of technology to suit the organization's continuous needs. Based on the need to implement a hospital management system and the associated limitations when applying HMS, including the common difficulties in the world and Asia in particular, especially the general difficulties presented below :
Lack of top management support: The majority of programs fail due to disagreements among the hospital's senior executives. According to (Turbit, 2005), top management engagement in project implementation is required to guarantee that the correct mix of business and IT is used to address any problems.

Poor skills sets among users: According to Burke et al. (2001), how weak HMIS user skill sets stymie project implementation. A lack of sufficient trained personnel leaves them wrestling with system issues both during and after implementation in a hospital. When a hospital switches from old to new technology, the employees must be trained in Turbit (2005). Employees must constantly upgrade their understanding of new software to stay up with the changing environment because ICT is a continuously changing profession.
Resistance to change: Burke et al. (2001) define it as a refusal to see benefits in a new HMIS due to what people are accustomed to (works for them). According to Gupta (2000), the most common stumbling block for most businesses is the aversion to change. He went on to say that resistance stemmed from employees' aversion to learning new procedures or the ICT department's aversion to change due to its commitment to current systems.

Insufficient Software evaluation: According to Turbit (2005), hospitals should go through all of the operations of the proposed software system and make sure that they are compatible with their own, such as from patient registration through discharge; this would considerably raise the system's acceptance level.

Poor Communication: Burke et al. (2001) emphasize the importance of continual contact with all impacted workers, including technical and non-technical users, to succeed in any information system implementation. He says that you should start doing this before you get to the implementation stage. The importance of communication in the implementation of HMIS cannot be overstated.

Lack of change management program: According to Lorenzi and Riley (2003), change management entails aiding individuals and organizations in migrating/moving from old to new ways of working. She says that the requirement for change management begins as soon as the project is conceived.

Security Issues: When a system is created, security considerations must be taken into account, according to Kendall & Kendall (2008). One of them is physical security, limiting access to physical computing resources. Behavioral security is defined as the control of software access and user rights for system users and the development of policies to prevent people from misusing computer hardware and software.

Benefits Realization: The excessive expectation of return on investment is another primary reason for HMIS deployment failure. According to Berg (2001), many hospitals overestimate the returns on a single technology while underestimating other project expenditures such as planning, consulting fees, training, and testing. When this happens, the project is bound to fall short of its target return on investment. 
2.2.1 Hospital Management Software Faces Difficulties in Viet Nam
Deploying electronic medical records: There are still many difficulties and confusion. VOV.VN - According to the Information Technology Department (Ministry of Health), up to now, only 14 medical facilities in the country have used electronic medical records.
According to Circular 46/2018/TT-BYT regulating electronic medical records, from March 1, 2019, medical facilities will use electronic medical records instead of medical examination books as before. According to Circular 46 of the Ministry of Health, currently, the implementation of hospital management software still has many difficulties as follows:

Expensive cost
Currently, hospital management software and information technology infrastructure hardware costs are pretty expensive. At the same time, with the implementation of electronic medical records, it is not easy to invest in digital signatures of patients and doctors instead of new signatures because the price of an electronic signature is relatively high. Meanwhile, the Ministry of Health has not yet included the price of information technology in the current price of medical services, causing difficulties for medical examination and treatment facilities.

“With a medical service, there are seven components in the price of medical services, but currently, information technology does not belong to 1 of those seven structures. Therefore, the Ministry of Health is building the cost of information technology services into the eighth structure to facilitate the investment in information technology in electronic medical records.”

“The connection of health insurance payment assessment data with the social insurance agency has been carried out with the result that more than 99.5% of medical facilities have deployed nationwide, but in order to reduce the difficulties of medical facilities when applying information technology, patients For electronic projects, the Ministry of Health is currently developing a standard for data interoperability between medical software at the unit, building a uniform medical identifier (ID) throughout the industry. (vov, 2019)

Note the confidentiality of patient information.

Also, according to Circular 46/2018/TT-BYT, electronic medical records must comply with the protection of personal information as prescribed in Section 2, Chapter II of the Law on Cyber Information Security. Medical examination and treatment establishments are allowed to use and store electronic medical records instead of paper medical records when meeting the provisions of this Circular.

Ensuring the confidentiality of patient information when making electronic medical records is extremely important. Because medical records are one of the documents stored in Confidential Data, the use and exploitation of electronic medical records must comply with the Law on Medical Examination and Treatment provisions. It should be clearly defined who can open it and where because ensuring patient confidentiality is one of the oaths of a physician. (vov, 2019)

Technology-related issues
When it comes to implementing EMR, one of the most significant difficulties is technology. Changes, additions, and support of application software are common technology-related issues. Interoperability is also a significant stumbling block to implementing an EMR system. Data entry or data integration might be problematic at times. Due to the complicated database system, the system's hardware and software have complex jobs and functions. Apart from technological issues, one of the system's concerns is a lack of computers and hardware. According to one survey, 60% of physicians believed the EMR system lacked technical support, and they also had issues copying and inputting vast volumes of data into patient records. (hochiminhcity.gov, 2020)

Human-related issues
The human aspect, particularly doctors, concerns the EMR system's deployment. Because many doctors lack computer skills due to a lack of IT expertise, one of the challenges relating to people is a lack of skilled users to utilize the system. According to one survey, 59 percent of doctors are computer illiterate. Because younger doctors are more likely to utilize IT tools than older doctors, older doctors are less interested in utilizing the EMR system. 79.5 percent of male doctors are more likely to use an EMR system, while only 20.5 percent of female doctors are more likely to use an EMR system.  (hochiminhcity.gov, 2020)




2.3 HOSPITAL MANAGEMENT SYSTEM BENEFITS
According to the World Health Organization(WHO), (World Health Organization, 2020) a reliable and effective hospital management system is essential for healthcare facilities such as hospitals, nursing homes, and rehabilitation centers. The following are only a few of the benefits of a hospital management system:
Improved Patient Care:
Better clinical judgments result from increased work productivity and greater patient data availability. Clinician orders the solution to be implemented after he receives the diagnostic report. Hence faster support is required for obtaining the reports quickly. With this automation, all departments in hospitals are interconnected and integrated, which improves patient care quality and hospital turnovers.

Data Retrieval and Data Security:
They are one of the cloud-based software in a hospital management system where everything is interconnected. Thus there are no chances of data breaches because they have excellent data security. Evidence-based medicine necessitates the ability to retrieve and store data, which is easily accomplished with the help of a hospital management system. If your hospital is equipped with a hospital management system, you may readily access operational, clinical, and financial data.

Cost-Effective:
Because the HMS information system aids in the tracking and control of finances and the reduction of leakages and manual labor, there is no need for a more extensive human staff.

Hospital management systems assist in reducing the amount of manual work performed by humans in hospitals, particularly for those responsible for keeping track of records and documentation. Because most of the work is automated, the hospital management system aids in lowering human resource costs.

Reduce the costs associated with storage and other related requirements. If your hospital has fully implemented HMS, it will become paperless; however, maintaining mandatory paperwork and other associated documents in your hospital to meet regulatory standards is sufficient.

Fewer mistakes 
Healthcare workers are under much stress. They are more prone to make mistakes somewhere along the route, from coping with the COVID pandemic to working excessive hours.
Apart from automating those tedious, repetitive operations, healthcare software is known for its accuracy, which reduces or even eliminates the possibility of errors.
To top it off, information technology has altered the world in the last decade. Incorporating this into the healthcare system will result in a more efficient and responsible system and improved patient medical professional connections.
Conclusion 
The research above explains a hospital management system, how it has been made, and the primary issue that could stymie its growth. The data gathered will be put to good use throughout the process. This project software system is a hospital administration system geared towards patients, doctors, and professionals that serve them. 
2.4 Technologies 
The project proposal states that a hospital management system will be developed, which will be a desktop-based system. Today there are many technologies to build a Desktop Application framework, for example: 
Java swing 
C#(.Net) 
JavaScript 
Database: My SQL. 
*Note: These technologies will be compared and explored to determine which is best suited for the hospital management system. 
 
For the hospital management system, select the most appropriate architecture. 
Finally, a management system for hospitals should be devised. The developer will be working alone, and the system has many services. As a result, the hospital management system will be written in Java. However, a recommendation system must be added to the system in this case; a recommendation system might be built-in in Java swing using the Flask framework. Another technology, such as the Spring Boot framework, might be used to provide additional services. Last but not least, testing Java Architecture is straightforward.
2.4.1 Java Swing 
a.	Definition. 
Java Swing is a graphical user interface (GUI) widget toolkit that replaces the Java AWT widget toolkit with a more robust collection of GUI components. The GUIApplication.java file is shown in Example 4.1. This is a common Java Swing graphical user interface application. You must extend the JFrame class from the java swing.* package to develop a Java Swing GUI program. The createAndShowGUI() function, which creates and configures the window, must also be implemented. The createAndShowGUI() function must be called a thread to display the window in the primary () method. 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/f7afb9a0-672e-4ebf-b6fc-c614e27f2ed8)
b.	Advantages: 
Free Cost even for business apps, Java is free to use. You will, however, have to pay for security and occasional updates. 
Simplicity Other programming languages are far more challenging to learn and use than Java. Java also uses garbage collection and automatic memory allocation. 
Platform Independence Once compiled, Java programs can run on any operating system thanks to the JVM. 
Object Orientation Java is an object-oriented programming language that allows reusable Java modules (classes). 
Security Java is built to be safe and secure. 
Multithreading You may create multithreaded programs in Java that do multiple tasks at the same time. 
Networking Java has many features that help develop networking applications easier. 
Mobile Development Java has many features that help develop networking applications easier. 
Enterprise Development Java can be used to build a wide range of business applications, including web servers and other application servers. 
 (Perry Xiao, 2019) 
c. Disadvantages 
Exercising Java is substantially slower than locally generated languages like C and C++ due to the JVM. For latency-sensitive applications, Java also consumes more memory and offers fewer customization options. 
  
Despite considerable advancements in the JavaFX GUI toolkit, designing GUI programs with 
Java is harrowing. The Java Swing toolkit's appearance and feel differ significantly from native Windows, Mac, and Linux applications. Chapter 4 will discover how to overcome the challenges and create GUI applications with Java Swing and JavaFX. (Perry Xiao, 2019) 
2.4.2  C# 
a. definition 
Microsoft Visual C# is a sophisticated yet simple-to-learn programming language explicitly designed for Microsoft.NET Framework developers. Many of the best features of C++ and Microsoft Visual Basic are retained in Visual C#. However, few inconsistencies and anachronisms are retained, resulting in a cleaner and more logical language. (Microsoft Visual C# Step by Step, 2018) 
b. Advantages 
To begin with, it is compatible with Windows. For a C# application to execute in your Windows environment, no additional changes are required. C# applications are simple to deploy over the network, whether as a web application, a Windows service, or a desktop application. As long as the target server or workstation supports.NET, moving your C# program from development to production should be simple. 
Next, hiring extra developers in C# is simple, whether on a contract or full-time basis. C# is a popular programming language to learn if your company grows and you need more developers. It also has a syntax that is very close to Java, so you should locate a developer who knows both languages (for mobile development). 
Finally, Binary code is kept on a public-facing server since C# is a compiled language. The hacker does not have access to your source code by default if your server is hacked. Other commonly used languages, such as PHP, might be used to gain access to source code, providing him with database passwords. Before a hacker can see the crucial components of your software written in C#, he must first decompile or "crack" it. 
c. Disadvantages 
Compiling the code was considered a "positive" in the previous section. While this is a benefit, compiling code has many drawbacks. Because you have to compile your code every time you make a small change, it is more challenging to deal with. You must recompile and deploy the entire application if you change a single letter in your code. When a minor modification is not well tested, it usually leads to additional issues. 
  
The program must run on a Windows server since C# is part of the.NET framework. Alternatively, any.NET program must operate on a Windows platform. Many new enterprises use Linux servers since they are much less costly. You will need Windows hosting to run a.NET application. 
 
.NET is the easiest to integrate if your company employs Windows PCs and servers. C# is a programming language that may automate processes like web applications and Windows Services. It works well in Windows environments and provides scalability as a company grows. The benefits of C# significantly exceed the drawbacks, which may be mitigated with the correct network configuration. 
2.4.3 .Java Fx 
a. Definition 
JavaFX is a next-generation client application platform for Java-based desktop, mobile, and embedded computers. It results from a joint effort between many individuals and businesses to create a modern, efficient, and feature-rich toolkit for designing rich client applications. (Mark J. Price, 2019) 
 
b. Advantages 
Adobe Systems has been working on JavaFX since 2005. It has steadily improved since then. Among JavaFX's many benefits, it is essentially a standard-compliant class library. It comes as part of the Eclipse IDE. Developers can also use JavaFX to create, evaluate, and test user interfaces for the web, mobile, and desktop. JavaFX also includes some graphics, input, and compositing features.
c. Disadvantages 
Here are some of the drawbacks of JavaFX that you should consider before switching to Java Swing. Technical Capability is Limited When it comes to the technical expertise required to be proficient with JavaFX and Java Swing, there are certain limits. JavaFX is a free and open-source platform, whereas Java Swing is a more established toolkit. As a result, some developers may choose to try both, but you will need some expertise if you want to become proficient with JavaFX. JavaFX is best suited for applications with a low level of complexity and is not recommended for applications with a high degree of complexity. A small group of people The open-source JavaFX platform has a high barrier to becoming comfortable with it.
2.4.4 JavaScript 
a) Definition 
The Netscape Corporation invented JavaScript as a programming language. In recent months, the language has acquired much traction since it enables web designers to adjust program activities and website content in ways that are not feasible with regular HTML or CSS. The engineer can use JavaScript on a site page to control how his page responds and acts to explicit client activities, assess the report components displayed on the page, approve the structure options before they are submitted, check the local program subtleties, set treats for explicit tasks, add date and time to the page, and even insert straightforward. Once you have mastered the fundamentals of OOPS and HTML, the rest of the language is simple to pick up and understand. (Lina Polly, 2018) 
b) Advantages 
Speed Because JavaScript is an interpreted language, it takes less time to compile than other programming languages like Java. JavaScript is a client-side script that allows programs to run faster by eliminating connecting to the server. 
  
Simplicity JavaScript is an easy scripting language to learn and master. Both users and developers will find the framework simple to use. It is exceptionally straightforward to set up, which saves web developers time and money when producing dynamic content. 
  
Popularity 
JavaScript is practically everywhere because all modern browsers support it. Google, Amazon, PayPal, and other well-known organizations all use JavaScript as a tool.
c) Disadvantages 
Client-side Security Because the JavaScript code is visible to the user. Third parties could exploit it. Using the source code without authentication is one of these methods. Furthermore, adding code into the site that jeopardizes the security of data sent over the internet is relatively simple. 
  
Single Inheritance There is just one level of Inheritance allowed in JavaScript, not several levels. Some applications may need this object-oriented language feature. 
  
Sluggish Bitwise Function A number is stored in JavaScript as a 64-bit floating-point number with 32-bit bitwise operands. As a result, JavaScript converts the numbers to 32-bit signed integers, performs operations on them, and provides the results to JavaScript. When converting a number to an integer, this continuous conversion takes longer. This increases the time it takes for the script to run and slows it down. 
2.4.5 Database 
MySQL 
a. Definition 
MySQL Database Service is a fully-managed database service that enables developers to create and deploy safe, cloud-native apps fast and easily using the world's most popular opensource database. The only MySQL cloud service with an integrated, high-performance database is MySQL Database Service. (Service, 2021) 
b. Advantages 
MySQL is a free and open-source database management system. The term "open source" refers to software that can be used and modified by anybody. Anyone can use the MySQL software for free by downloading it from the Internet. 
  
MySQL Database Server is a database server that is quick, trustworthy, scalable, and easy to use. It is worth a go if that is what you are looking for. MySQL Server can coexist with your other software, web servers, and other servers on your desktop or laptop, requiring little or no maintenance. You can change the parameters to make the most of the available RAM, CPU power, and I/O capacity if you commit a complete system to MySQL. MySQL may also be scaled to clusters of machines connected via a network. 
  
MySQL Server can be used in both client-server and embedded environments. MySQL Database Software is a client-server system that includes a multithreaded SQL server, client applications and libraries, management tools, and various APIs (APIs). MySQL Server is also available as an embedded multithreaded library, which you can use to build a smaller, more efficient database, quicker, and easier-to-manage standalone solution. 
There is a lot of MySQL software that has been contributed. 
 
c. Disadvantages 
When it comes to massive databases, MySQL is not particularly good. MySQL does not have as good development and debugging tool as premium databases. In MySQL versions below 5.0, COMMIT, stored procedures, and ROLE are not supported. MySQL is prone to data corruption due to its poor transaction processing. MySQL does not support SQL check limitations. 
SQL Server 
a. Definition 
 SQL Server is a relational database management system (RDBMS) that Microsoft created. It is essentially software that helps you to store, update, and manage relational data effectively. Microsoft SQL Server, Oracle, MySQL, PostgreSQL, and DB2 are the most widely used relational database management systems. 
b. Advantages 
Microsoft Premier support and product documentation You will have access to a network of qualified specialists from Microsoft's specialized support teams with Microsoft Premier assistance. If you have any issues with MSSQL, they will be happy to assist you. 
 
Both on-premises and cloud databases are supported. If your organization requires it, you may outsource database administration and maintenance to the cloud using Azure SQL Database or SQL Server on Azure Virtual Machines. 
c. Disadvantages 
Pricing is prohibitively expensive. The first disadvantage on our list of Microsoft SQL Server advantages and disadvantages is entirely financial. Many businesses are unable to afford the Enterprise edition. A per-core license costs $14,256 at the moment. Licensing is complicated. 
SQL Server license is tough to grasp and is constantly changing. 
2.5 Methodologies 
2.5.1 Waterfall 
a. Definition 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/a1a54f37-7d88-4b3b-b926-1a80de488483)
Figure 4:The waterfall model
The waterfall model is a software development sequence design process that represents progress as flowing downhill (like a cascade) through concept, initiation, analysis, design, implementation, testing, and maintenance stages. Each step must be completed entirely before going on to the next in this process. At the end of each phase, a review is conducted to assess whether the project is on track and should be continued or abandoned. Furthermore, the stages in this paradigm do not overlap. (Sarker, Iqbal H., Faruque, Faisal, Hossen, Ujjal, Rahman, Atikur, 2015)
 b. Advantages 
Simple and straightforward to comprehend and apply. Because each phase has specified deliverables and a review procedure and is completed one at a time, the model is simple to manage. Works effectively for smaller projects with well-understood and sufficient requirements. 
c. Disadvantages 
It is difficult to go back and fix anything that was not well-thought-out in the idea stage once an application is in the testing stage. Until the end of the life cycle, no working software is developed. There is a lot of danger and uncertainty. It is not suitable for projects that are long, complex, or object-oriented. Projects having a moderate to high likelihood of changing needs are not recommended. 
2.5.2 Agile 
a. Definition 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/09ae1a9b-a69d-4a3a-9c41-b99f466b7b08)
Figure 5:chart of Agile model
 
The incremental development model is a hybrid of agile and waterfall development. Software is developed in rapid, iterative cycles. As a result, minor incremental releases are made, each one building on the features of the prior one. Each version is thoroughly tested to guarantee that software quality is maintained. It has been utilized in applications that must be completed within a certain amount of time. One of the most well-known agile development life cycles approaches is Extreme Programming (XP). (Sarker, Iqbal H., Faruque, Faisal, Hossen, Ujjal, Rahman, Atikur, 2015) 
 
b. Advantages 
Continuous Delivery. Communication with clients on a one-on-one basis. Design that is both efficient and meets the needs of the company. Changes can be made at any moment. It cuts down on overall development time. 
c. Disadvantages 
There is confusion due to a lack of formal records, and crucial choices taken at various phases might be misinterpreted by different team members at any moment. Once the project is done, and the developers are allocated to another project, maintaining the completed project might become difficult owing to a lack of proper documentation. 
Select the most appropriate method for your hospital's management system. 
Many functions and hospital domains are included in the hospital management system, and technologies have been explored and chosen to develop the hospital management system. 
Aside from that, the developer has prior experience developing several types of software. As a result, the Agile method may be a better fit for designing the hospital management system because the developer will know which tasks should be built and delivered first. Because this project is being used as a final university project. As a result, Mr Doan Trung Tung, the author's supervisor, will serve as the project's product owner, providing input and comment on product backlogs and sprint backlogs to deliver the system on time and with the best possible performance. 
Conclusion. 
In Scrum, some jobs do not exist in the waterfall technique. Scrum is a team-oriented methodology that requires many stakeholders to participate. Between five and ten persons is the ideal team size. On the other hand, the waterfall method puts no restrictions on the size of the team.
3 Requirement Analysis 
Finally, this section presented the hospital management domain. As a result, readers will understand how vital hospitals are to human health and lifestyle. In order to establish the best appropriate technologies for developing the system, numerous different technologies have been examined; for example, the author could use Java architecture to develop the system. After that, the author might construct the all system with Java Swing. After investigating these technologies, the author opted to utilize Java software architecture for system architecture, Java Swing for all hospital management systems, and the Agile approach for the build system. The reasons why the author wishes to develop the system mentioned above using these technologies. 
3.1 Similar application  
Introduction 
Despite the availability of numerous hospital management software (HMIS), many hospitals, particularly those in poorer countries, continue to rely on paper-based records. Science and technology have improved every sector in which they have been applied, and medicine is no exception. The medical industry has benefited enormously from technological breakthroughs, from life-saving vaccines and procedures to ever-more-detailed scanning tools. 
 
3.1.1 SoftClinic 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/bf5c1f0e-8336-4893-ba75-2c05f9398055)
Figure 6:SoftClinic Hospital Management Software
 
[Source: https://www.softclinicsoftware.com/hospital-information-system-his/] 
 
a. Definition 
SoftClinic is a hospital information management software that manages the administrative, financial, and clinical aspects using an integrated information system design. 
 
This applies to both paper-based and computer-based data processing. The ability to control patient flow effectively in real-time is a criterion that must be addressed. We have made a complicated technique easier to understand. With a multilingual user interface and one-click language change, our Hospital Management Software (HMS) is excellent for managing global hospital chains. 
 
By providing workers with accurate and timely patient information, workers may reduce wait times and improve patient care. Modules for appointment scheduling are included in this allin-one hospital administration system, billing, OPD, IPD, inventory, pharmacy, laboratory, radiology, and more. 
Appointment function
This feature allows patients to schedule appointments with doctors while also assisting the hospital in monitoring and controlling the flow of positions available to their doctors. Patients and doctors are both reminded of their appointments using the system's built-in reminder mechanism.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/18df9f40-856d-42ea-b9cd-8c9bc14c2848)
Figure 7:User Appointment of SoftClinic system
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/0676c616-1d79-46f9-8d77-75d3b015cfea)
Figure 8:SoftClinic Features.
Overview of SoftClinic Benefits 
 
SoftClinic EHR/HMS has a reporting feature that allows users to generate and create clinical analysis reports quickly. This feature gives them fields to fill in with the detailed information they want to include in their report. Tabs are also supplied to add a combination to filter the query and choose the kind of reports they want to see, such as charts and tables. 
 
When users want to create a clinical report based on gender and location, they can choose these data to specify the information that will appear in rows and columns in tables, bar graphs, and pie charts. They can also compile and create clinical reports using data from other modules, such as an appointment, a visit, or a test. Physicians and healthcare specialists can use this tool to assess medical and health records effectively. 
 
SoftClinic also contains a function that allows users to quickly view and edit photos, including their file names and metadata. Users can use SoftClinic's File Manager to pull up a specific patient and view the image associated with a procedure by entering a patient ID number. The image can be printed or added to a PowerPoint presentation. This function allows clinic and healthcare facility employees to locate and manage files in less time. 
 
Security 
 
We use Secure Sockets Layer (SSL) Software, which encrypts information you type, to safeguard the security of your information during transmission. SoftClinic Software is devoted to protecting your personal information and takes all reasonable precautions to do so. Your personal information is only accessible to SoftClinic Software staff. Our workers are expected to keep this information confidential and may not use it for any reason other than providing the services that are part of their job. Your personal information is solely used for internal purposes and is never sold or shared with anybody outside of SoftClinic Software unless we are required to do so by law. 
3.1.2 eHealthFlex
eHealthFlex is a hospital management software that assists wellness centers, clinics, and healthcare organizations with billing, appointments, and patient management, among other things. Supervisors may track staff check-in/out, create, assign, and monitor job progress, calculate work hours, and receive real-time reminders for pending assignments using the solution's attendance, task, and log management capability. (eHealthFlex, 2019)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/3a8df8ed-f010-4704-a784-a502860cf353)
Figure 9:eHealthFlex page
Functions that are offered
System for Managing Laboratories: This feature enables the hospital to merge patient test data and records, allow patients to schedule pathology tests online, reduce paperwork by emailing test results and exporting receipts online, and more.
 
Management of Patients: This feature aids the hospital in keeping track of treatment plans, drugs, and procedures for hospitalized patients. It also aids in the organization of nursing staff checklists, which include all important consultations and treatment changes, among other things. Furthermore, the technology enables patients to check in without the assistance of a human, reducing the time and effort required to maintain digital patient data, and processing patient appointments to avoid long lines.
 
 
Department of Out-Patient Care: The technology enables patients to check-in without human help, reducing the time and effort required to maintain digital patient data and manage patient appointments to avoid long lines. a long queue
 
Pharmacy Administration: This program aids the hospital in tracking order status and managing over-the-counter medicine inventory, procurement, and dispensation. 
 
Solution for Billing: This function aids hospitals in keeping track of patients daily, retaining patient billing information, and matching account billing to local and federal tax compliance.

Conclusion 
It is advantageous to examine and consider the advantages and disadvantages of similar goods while producing hospital software, as this will help boost security and assure a good and advanced measure. Several advantages of the hospital management system have been highlighted, and the data gathered will aid in the development of the application depending on its improvement needs.
3.2 Requirements 
In this section, data from multiple sources will be analyzed and transformed into requirements for developing this healthcare application. There will be a generation and prioritization of functional and non-functional requirements. The initial phase in developing the app is crucial because it will aid in project planning, budgeting, and preparation.
3.2.1 Functioning Requirements 
Functional requirements are the requirements that define a system or its components. They are the tasks that a well-crafted plan is most likely to accomplish. Another name for them is high-level requirements. Based on data from the survey and reviews of similar products, the table below displays all of the functional needs for each user task and their relevance to this project.
Priority demands are handled using the Moscow method, which stands for:
"Must have," "should have," "could have," and "will not have" are all abbreviations for "must-have," "should have," "could have," and "will not have."
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/84147c23-d336-466e-8b9a-f1c65fb50635)
3.2.2 Non-Functional Requirements
Non-functional criteria define the system's quality attributes. They are defined as a set of criteria that are used to assess and evaluate the system's unique performance. Usability, security, reactivity, and other factors are all critical. The following are the non-functional criteria for this project's application:
3.2.2.1 Usability 
It will be as user-friendly as possible if the application operates smoothly and has a high success rate. Users will be able to comprehend the meaning of action with the help of interface metaphors. 
3.2.2.2 Security 
The application will be made as secure as possible by implementing a hashing technique, which maps data to a fixed-size hash. The Java hash algorithm is a cryptographic hash function. Furthermore, when saving sensitive data, such as passwords, the program encrypts the data and decrypts it when it is retrieved.
3.2.2.3 Responsiveness 
The app will be adaptable to various device sizes and modes (portrait and landscape). This will be accomplished by employing a variety of response criteria, such as media queries. The software's responsiveness will be tested across various device sizes and modes.
Conclusion 
Finally, the application's functional and non-functional requirements were outlined. This standard will go a long way toward assisting in the planning and visualization of applications.
4 Design 
4.1 Use case  
The features available for each user engaging with the system are depicted in the Use-Case diagram below. As can be seen, there are three primary types of administrative personnel: medical assistants, doctors, and others.  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/6ee27f11-55e1-4c32-9aef-cc438148b56e)
Figure 10:Hospital Reception System
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/d19b8f71-9bfc-4dd1-9619-b4eaf5d8faea)
Figure 11:use case diagram for admin of HMS
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/8087b004-3f6f-4d0b-ad2c-7c93f32484a9)
Figure 12:use case diagram for nurse of HMS
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/2eee6fb9-f892-47f1-9456-01c74c9ace32)
Figure 13:use case diagram for Doctor  of HMS
Admin: refers to a single or a small group of users who have logged into the system but have access to additional features, such as those that allow them to handle the system's data, such as doctors and medical assistants.  
Doctor: Refers to the users who have logged into the system to access their private features. Only logged-in users have access to services like managing diagnosis and viewing the patient.  
Nurse: Does an administrator add an object, the staff member is responsible for helping doctors manage medical records and view patients, besides performing the task of adding patients, creating patient profile details and assigning doctors by specially  
4.2 Class diagram (optional)  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/bde102fc-6547-4f66-a9bf-9f07b72063e9)
Figure 14:class diagram for Hospital Reception
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/2fd140e3-0953-447a-881b-97566ef25df5)
Figure 15: API Class diagram
	4.3 	Database  
The Entity Relationship Diagram depicts the database architecture and all of the system's entities, characteristics, and relationships. Each table in the Java application represents a collection of data connected with a Model. The following is the ERD that was created: 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/8803de00-b13a-4aab-8026-348ddfbf7e56)
Figure 16:database diagram
The Presentation Portal system's database contains five tables:  
Patient table: (containing details about the patient) The nurse will enter the information and store it in the database. Doctor ID is a foreign key column that refers to the id from the Doctor's table.  
  
Doctor table: Documents about the Doctor should be saved. The information will protect the following data: id, name, age, and, most importantly, status (the data information added by admin). The foreign keys in the staff and medications columns refer to the id column in the Medicines, Staff, and Diagnosis table.  
  
Medicines table: Medicines information should be saved. Each medicine has a name, a quantity, a description, a code type, and a Med price, with all data relating to DocID, PatId, and Diagnosis. The DocID, PatId, and diagnostic columns will be the foreign keys and references from the diagnosis's id column, and Doctor tables will determine who owns the diagnosis.  
  
Staff table: As a nurse assists the Doctor and the patient by entering patient information (diagnostic) into the system, the system will create a record in the diagnosis table. An ID (primary key) will be used to identify each nurse, followed by Doc ID (foreign key) and references from the Doctor's table's ID column.  
  
The diagnostic administrator will populate the diagnosis table with data fields such as symptoms, medications, and diagnostic findings. Each diagnosis will be recognized by the id (Primary key), Doctor ID, Pat ID, and name of both, utilizing references from the id column of the Doctor and patient tables as the foreign key and the diagnosis on treat id as the foreign key. 
4.4 	Activity    
Add Patient  
Before each patient input, the Nurse can add a patient and assign a doctor to examine that patient. Each patient will be assigned an examination doctor based on each patient's symptoms and associated with a unique identification code (ID) randomly generated by the system, especially with no duplicate codes. The Nurse needs to fill incomplete information such as patient name, address, age, disease symptoms, v, v. Based on the information provided. I will appoint a doctor to examine according to speciality and Doctor's status. If the information entered by the Nurse is complete and correct, the system will construct a diagnostic form; if the information is missing, the system will display an error message on the screen. The server will set an appointment to push the system to the Doctor after saving the Patient information to the database.  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/f8ad1408-e975-46b3-9140-ce532c233172)
Figure 17:Add Patient activity diagram
After the patient is added to the system, the doctor can use the available patient data and create a diagnosis, and a doctor will create each diagnosis. Each diagnosis will be identified by an id code, which is randomly generated by the system and has no duplicates. The doctor needs to fill in all information such as symptoms, drug name, diagnosis name of a disease. The system will create a diagnosis for the patient if the information is comprehensive and accurate; if the information is missing or erroneous, the system will report an error out of the screen. 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/588df81a-2906-449b-b061-1996942601bf)
Figure 18:Create diagnosis activity diagram
5. GUI DEVELOPMENT (WIREFRAMES)
A wireframe is a diagram that shows how the various pieces of a website's interface will work together. It serves as the foundation for a website. Here you will find wireframes for some of the system's most significant pages.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/d5348e54-ddf0-4857-8587-098b7b57eedd)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/56b481ee-161a-4d4a-98c4-5b8b9fe53d02)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/6618a91e-0248-4776-a2f3-bf8542c52e50)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/e7d2a4af-a9ab-428b-9311-3aab20b20319)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/4e5005b0-d7bb-4d5e-a645-d09c7a9f5421)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/4b5402a4-0f53-4b4f-b235-a365100fc663)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/7f89264f-c05b-4ba4-9e42-ae5c1e63eb4f)
6. Implementation  
Introduction  
The item for actual development will describe what was done and accomplished during the project's execution. To be clear, the consequences are described in detail below and thorough instructions on how to utilize and execute them—precisely, the application's usage of Java Swing technology. 
PROGRAMMING LANGUAGES SELECTED
The framework and programming languages for the system have been chosen: Java and JavaSwing. Java Swing is a window-based application framework part of the Java Foundation Classes (JFC). It is written in Java and is based on the AWT (Abstract Windowing Toolkit) API.
Java Swing, unlike AWT, provides platform-agnostic and lightweight components. Java Swing was chosen as a feasible programming language for this project because of the following advantages:

•	JavaSwing extends the capability of AWT-replacement components by adding new components.
•	JavaSwing has a built-in double buffering system.
•	When building your components, JavaSwing provides paint debugging support.
•	JavaSwing components follow the Model-View-Controller (MVC) paradigm, allowing a considerably more flexible user interface.
•	Components of the JavaSwing are light (less resource-intensive than AWT)
Install libraries and add JDBC SQL derby for project  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/79ecdcca-21cd-40db-bffa-5ad3e7e23cad)
Figure 19:add JDBC-derby for project
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/bae95e9b-52cf-40ed-a2c4-35cbc5e91db6)
Figure 20:set Customize JDBC-derby for project
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/167e0b2d-4a1f-4332-ba81-0609a117920e)
Figure 21:add libraries for import project
After adding JDBC-derby SQL to the server in the system, configure the Java DB(Network) to add-lib(derbyclient, derby shaped) automatically. From there, the system automatically finds the Driver class and automatically imports it into the library. That is all it takes to configure and set for a hospital management project.  
Create SQL Colum 
Four modules of system  
The author decided to use the Java Swing framework to construct the hospital administration system. JDBC-derby SQL will be in charge of practically all of the hospital management system's server data. As a result, each backend service will assume distinct duties to ensure that the hospital administration system runs smoothly in production. This section will show how the author developed backend services to address particular issues.  
Structure code of Java swing project  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/db3c585d-4b25-43be-83ec-ae79a29e6011)
Figure 23:Structure of Java swing project
  
Algorithms applied in the project
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/a41eced2-db9e-4b51-95a0-00196836ae70)
Figure 24:Confirm and query username and password login
When logging in, the system will query the username and password; besides, when the user enters the password, the system will get the hash code (MD5) and compare it with the Doctor, admin database tables. If the user is Doctor, then the system will confirm and show the appropriate screen, which goes for the administrator.  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/382cd705-ccd9-48a2-8b75-9a6531346baf)
Figure 25:Hash pass algorithm MD5
Declare the "oldpass" attribute to manage the user's password. When the user selects any data in the table, the system will automatically upload it, then assign the new password value with "oldpass". Besides, if the user performs the update function, the system will check the new password and the old password; if there is, the system will ignore it, and if not, the system will generate a hash code and save it in the database MD5. Finally, create a function to check user data when entering; if it is empty, the system will notify "missing information".  
  
  
Design interface  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/40fe4bfc-e80a-4f95-b048-080982209787)
Figure 26:the first process when system run
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/3b3e078b-c786-443b-bb3f-86bc9e711577)
Figure 27:the login form of HMS
Login by account admin   
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/b0a09251-2174-45e7-b25d-ec479fab8cc1)
Figure 28:homepage of Doctor and admin
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/48ad0ae4-cf6f-47c0-bdbc-66e35fbec37f)
Figure 29:Admin account management
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/26796427-f310-403c-9218-bbb4e6e97a58)
Figure 30:Doctor account management
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/faef69ee-c5d4-4850-a1ab-e83937edf5fe)
Figure 31:Patient module interface
Diagnosis module 
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/ddb6ccf9-6818-4040-965c-7225d489da8a)
Figure 32:Diagnosis module interface
7 Evaluation
7.1 Introduction
This report chapter will look at the product and the procedure. A personal assessment of the product will be conducted, followed by a peer review of the product. The developer will evaluate the process. Finally, future work is discussed, which may help the application progress.
7.2 .Product Evaluation 
7.2.1. Personal Evaluation
The final product of this endeavor far exceeded my expectations. The app is running according to the original plan. The rigorous testing eradicated most bugs; however, more test cases must be written before this application can be released to the broader public.
•	Define hospital 
•	Manage Staff
•	Recording information about the Patients that come. 
•	Recording information related to diagnosis given to Patients. 
•	Keeping record of the diagnosis
•	Keeping track of various diseases and the medications that can be used to treat them. 
These are the different roles that operational employees, doctors, and administrative staff must perform in a hospital.
Based on the initial goals set forth, such as system functionality and operability, consistency throughout the application was designed with the user in mind. However, some of the system's interfaces need to be reconsidered, as the design of some pages can be better optimized, thereby providing a good user experience. Furthermore, since the design is mainly made by myself, there will still be some deviations that need to be rectified in terms of responsiveness. From the above conclusion, I will evaluate the system according to the following criteria:
The entire goal of the project, including the features I proposed, has been completed. However, besides that, there are still functions that need to be upgraded and modified to bring a flexible experience to users, such as Manage Staff, Keeping track of information on the patients who come in, as well as information about the diagnoses that are provided to them. From the functions that need to be improved and upgraded in the future with the following purposes:
•	Easy to use for users, shortened staff training time, optimized usability, easy-to-use interface for newcomers
•	the interface displays prominent and essential information through the search feature in each patient's diagnostic record
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/d7b1392f-5427-43f9-8f6d-98b94d9eea04)
Figure 33:search function and show diagnosis patient
7.2.2 Human Interaction
Some design ideas were used to create the hospital administration system (Nielsen's ten heuristics, Norman's seven principles, and Shneiderman's eight golden rules). Readers can learn more about these principles by visiting:
 (Jakob Nielsen's, 2020)
(Norman’s 7 Principles, 2019)
(washington, 2020)
To evaluate the application, some principles will be utilized.
Provide Feedback
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/a3289c0a-b4d1-4cde-bfda-5bb3f774abeb)
Figure 34: The system will warn a user if their credentials are wrong.
Under this notion, users must be aware of their dealing with. When a user logs in, the system should inform them whether or not they have logged in successfully.
Consistency
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/bd954281-b09e-4576-80c6-c37eb83ef8e7)
Figure 35:The system's user interfaces are consistent (colors, fonts, ...)
The hospital management system must be consistent in its architecture. The JavaSwing libraries were used to construct the system components for the system user interface. As a result, the system's user interface is consistent, with the same colors, fonts, and icons. For more information, readers can look at the images below. The colors, fonts, and user interface are all consistent, as the reader can see from the image described above. The user information for each patient on the list is the same.
Recognition rather than recall
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/7000dbca-d1a0-4dfe-8ce0-d287a03f58a6)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/699f0b73-345a-49b5-ba7f-f3459f5e69fc)
Figure 36:The doctor can see each patient's diagnostic information without recalling the results.
Because there is sometimes too much information for the doctor to comprehend, the doctor does not need to remember the information from the previous section relating to the current activity. The doctor can view the name, symptoms, drug name, and previous diagnosis in the graphic above without memorizing them.

Strengths of hospital management software
MOBILITY 
Trial versions of hospital administration software can be downloaded easily via the Internet over thousands of kilometers for a standard Internet connection fee. If the trial version of the hospital management software meets the user's expectations, he or she may elect to purchase the registered version. Variable-size diskettes, CD ROMS, and other media can also be used to distribute hospital management software.

On the other hand, traditional engineering objects are frequently challenging to transport from one area to another. Bridges, dams, and concrete structures are all examples of this. They stay put once they are built, at least for the time being (assuming normal circumstances).

SCALABILITY 
Hospital software is scalable and adaptable to changing requirements. A system for keeping track of diagnoses and storing information processing could be established to record an organization's day-to-day actions. This approach might then be used to create a Management Information System for hospital executives to generate organized summaries. Hospital administration may request a Decision Support System, which uses data from the underlying database to analyze unplanned circumstances. Top management is mainly concerned with an Executive Information System capable of providing information in an executively summarized fashion further up in the hierarchy. (O Leary and O Leary, 2000).

BACKUP 
A backup is a powerful tool for preventing data and program loss. The backup operation in the medical software domain is done at a low cost and with no effort. In contrast, the backup of a specific engineering product may be too costly to maintain. Software backup is done for various reasons, including data security and integrity. (Pfleeger and Pfleeger, 2003). Recovery operations can be started from the backup version in the event of software and associated data loss due to hardware failure, deliberate corruption, or natural disasters. On the other hand, traditional engineering objects do not fall under this category.
Weakness of hospital management software

REGULAR UPGRADES 
Regular upgrades to hospital software increase its quality, performance, and efficiency, but they are costly in the long run. Older versions of hospital software are sometimes no longer supported, or the maintenance service is charged at a higher rate. To remain competitive, the user is required to accept this expense. An annual software and hardware upgrade is frequently required; however, this may not always be feasible due to the high cost and frequency of said upgrade.


BUGS 
It is common to find problems and flaws in hospital software right after it is deployed, necessitating a call to the program developer to fix them. This can impact a user's trust in a hospital software development. It is reasonable to assume that the bigger the number of bugs, the greater the loss of trust. As a result, a software developer should strive to eliminate these defects as soon as feasible, requiring extra effort during the development and testing phases. As stated in a previous paragraph on complexity, bugs are frequently attributed to the intrinsic complexity of software.
In addition, some places need to be noted and overcome, such as the interface is too simple and rudimentary. In addition to the essential functions, it is necessary to add advanced features to complete a hospital management software most optimally and most realistic for the healthcare market in Vietnam.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/f4ef73ea-81c2-468e-b51c-33eae4fc6c61)
Figure 37:Home Page
On the other hand, due to various variables, hospital software problems are less common after deployment. These considerations include improved visibility during the development process, an acceptable level of complexity, and existing formal procedures to aid the well-established development process in the theoretical literature, such as the Whall verification debate. (Le Charlier and Flener, 1998; Woodcock and Davies, 1996).



7.5 Test Plan
APPENDIX , after this report, contains the test cases for this project.
8 Conclusion 
The graduation project's research, application development, and application production phases have all been accomplished. I can obtain a great deal of experience as a result of this process:
1.	Knowledge  
The report gained insight and expertise of desktop Microsoft Windows platforms, languages to develop in, and methodologies to develop desktop apps through the authoring of the Literature review. Along with that, there are the benefits they provide and the drawbacks that must be conquered—understanding the Microsoft Windows platform's programming language and hardware infrastructure. 
 
2.	Skills in programming 
Can create both desktop and mobile front-ends, as well as APIs, databases, and back-ends. Make possibilities for people to learn how to become full-stack developers. Improve code writing, code cleaning, and code management skills with the support of colleagues and classmates. How to prepare for an Agile project and keep track of time while it's being carried out. 
 
3.	Writing abilities for reports. 
This report can be used to gain much experience in producing reports, such as presentation and report typefaces, cite a source in a report and provide particular proof for each citation. 
 
8.1 Future works 
One of the aspects that will surely improve this project is using a multi-cloud solution to store the application's media files. This, in my opinion, will be a significant enhancement to the application because it will protect media files while also lowering the cost of purchasing and maintaining a separate storage space.
In addition, a complete statistical analysis tool would be a fantastic addition to this software, enhancing and adding value. Hospitals should use the application to track and measure how their revenue grows or drops over time. I feel this will be good. 
8.2 Self-evaluation  
The Waterfall method is a software development strategy for managing the development phase. It was the most suitable technique for completing this task, in my opinion. The application's progress could be tracked weekly because each phase had precise bounds. Throughout the program's development stage, tiny tests were carried out to check that a particular feature worked and that the application was wholly built once the development stage was over.

I could not keep up with the deadlines for each phase, which was one of the issues I encountered with Waterfall. Specific steps took longer than expected due to unforeseen situations. As a result, the timetables of other stages will be impacted.

The Waterfall approach had already been demonstrated to be appropriate in the context of this project.
8.3 CRITICAL REFLECTION
Through intensive study, critical analysis, and research, this project has helped me better comprehend a variety of software development technologies, including Java swing and others. Due to this job, I gained a better understanding of how to create and integrate these technologies into a hospital management system.

One of the challenges encountered during the construction of this project was time constraints. Time was lost as a result of unforeseen events. However, by addressing the concerns mentioned above, I could surpass this time constraint. A significant criterion was my capacity to rearrange my schedule to meet the requirements. Furthermore, due to my lack of database experience, establishing a relationship between the application and the database proved challenging during the development phase. This was straightened out after a thorough inquiry. I was able to connect the software and the database in this manner.

The project was finally completed, with the majority of the requirements met. On the other hand, future developments would not be neglected and would be incorporated into the system's next edition.
9 Appendix - TEST PLAN
TEST CASES 
REGISTER 
The goal of this component of the test plan is to examine the "Add account" and "Login" functions of the HMS application. Users must enter information that will be used to authenticate them on subsequent visits to access this function. Users are given access Depending on their user role, and they will have access to the system and the required views once they have enrolled (See RoleView Test cases). Nonregistered users will only see the use case graphic's use cases. 
 
INSTRUCTIONS FOR THE TEST
Step 1: There is an Add button in the upper-right corner of the app.
Step 2: In the Username text box, type your preferred username.
Step 3: In the account text section, type an account address. 
Step 4: In the Password text section, type the password you want to use.  
Step 5: In the Confirm Password text section, type your chosen password again.  
Step 6: From the drop-down option, choose "Login."
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/c348fde1-54ab-437f-acbc-64ac758d2630)
INSTRUCTIONS FOR THE TEST
Step 1: In the app's center corner, Login by clicking the Login button.
Step 2: In the Username text area, type the user's Username address.
Step 3: In the Password text box, type the user's password.
Step 4: Select "Submit" from the drop-down option.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/8de4e5dd-bc92-456e-978c-3ab72a29177c)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/9f402e3f-15da-4806-be5f-f5495a90e779)
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/58ec31aa-2922-4f46-8e21-c1dc9b578683)
Table 5:Test Cases for add Patient
INSTRUCTIONS FOR THE TEST
Step 1: Select a 'Diagnosis' option from the drop-down menu.
Option 1: Medicines, as well as symptoms for Diagnosis drugs, will be available.
Option 2: The patient Id will be searched at the top of the search results, and the displayed results will include the disease name and any accompanying specific medications.
Option 3: A prominent diagnosis can be seen on the home page.
Step 2: To submit the diagnosis, click the 'Continue with Step 3' button.
Step 3: Click 'Update' to finish the print diagnosis result.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/dd047524-b3ce-43ac-9c3c-c8fa0e03cd84)
INSTRUCTIONS FOR THE TEST
Step 1: Then, from the drop-down box, select My Account.
Step 2: From the drop-down option, choose Update Account.
Step 3: Change the data as needed.
Step 4: Type your current password in the Existing Password text box.
Step 5: From the drop-down option, choose Update Account.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/5bff2736-971f-44c9-8068-704bc8007260)
9.1 Plan  
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/3672cfcd-ebf4-4646-9645-e434c838b17e)
Figure 38:WBS for hospital management system.
![image](https://github.com/Jeussu/Finalgraduationthesisin2023/assets/94780400/0e47614a-cd9c-45d0-aa76-d35eb57c91bb)
Figure 39:Gantt chart for hospital management system.
References
World Health Organization, 2015. World Health Organization. [Online] 
Available at: https://www.who.int/data/gho/indicator-metadata-registry/imr-details/4791
[Accessed 2015].
frontenders, 2020. 5 Effective Data Storage Options for Hospitals. [Online] 
Available at: https://www.frontenders.in/blog/5-effective-data-storage-options-for-hospitals.html
Glorium Technologies, 2019. Glorium Technologies. [Online] 
Available at: https://gloriumtech.com/hospital-management-system-features-solutions-modules/
healthdirect australia , 2020. healthdirect.gov.au. [Online] 
Available at: https://about.healthdirect.gov.au/data-management-processes
healthit.gov, 2019. healthit.gov. [Online] 
Available at: https://www.healthit.gov/faq/what-electronic-health-record-ehr
instahms, 2021. instahms. [Online] 
Available at: https://www.instahms.com/blog/challenges-of-hospital-management-software-implementations-at-clinics/hospitals
Rossana Rivas, Luis Vilcahuamán, July 17, 2017. Healthcare Technology Management Systems. 1st Edition ed. s.l.:s.n.
Turbit, 2005. CHALLENGES FACING THE IMPLEMENTATION OF HOSPITAL MANAGEMENT INFORMATION SYSTEMS IN HOSPITALS IN NAIROBI. [Online] 
Available at: http://erepository.uonbi.ac.ke/bitstream/handle/11295/12271/Kimama_Challenges%20facing%20the%20implementation%20of%20hospital%20management%20information%20systems.pdf?sequence=3
vov.vn, 2019. Deploying electronic medical records: There are still many difficulties and confusion.. [Online] 
Available at: https://vov.vn/xa-hoi/trien-khai-benh-an-dien-tu-van-con-nhieu-kho-khan-va-lung-tung-928988.vov
vov, 2019. Deploying electronic medical records: There are still many difficulties and confusion.. [Online] 
Available at: https://vov.vn/xa-hoi/trien-khai-benh-an-dien-tu-van-con-nhieu-kho-khan-va-lung-tung-928988.vov
World Health Organization, 2020. World Health Organization. [Online] 
Available at: https://www.who.int/vietnam/health-topics/hospitals

Christian Johnson, MPH & Yuriy Pylypchuk, PhD, 2021. ONC Data Briefs. [Online]  Available at: https://www.healthit.gov/topic/about-onc/data-briefs 
grandviewresearch, 2021. Digital Health Market Size, Share & Trends Analysis Report By 
Technology (Healthcare Analytics, mHealth), By Component (Software, Services), By Region, And Segment Forecasts, 2021 - 2028. [Online]  
Available at: https://www.grandviewresearch.com/industry-analysis/digital-health-market HealthIT.gov, 2019. Hospital management system market. [Online]  Available at: 
https://search.usa.gov/search?utf8=%E2%9C%93&affiliate=www.healthit.gov&query=Hospi tal+management+system+market 
Jakob Nielsen, 1994. Usability engineering. Anon: Anon. 
Jerome H. Carter, 2008. Electronic Health Records: A Guide for Clinicians and Administrators. Anon: Anon. 
Lars Vogel, Wayne Beaton, 2013. Eclipse IDE. s.l.:vogella.com. 
Lina Polly, 2018. Python Programming & Javascript: What Is Javascript: Will Python Replace Java: Enter Into The Programming World With Python Training. s.l.:s.n. 
Mark J. Price, 2019. C# 8.0 and .NET Core 3.0 – Modern Cross-Platform Development Fourth Edition. s.l.:Packt. 
Microsoft Visual C# Step by Step, N. E., 2018. John Sharp. s.l.:Microsoft Press. 
Perry Xiao, 2019. Practical Java® Programming for IoT, AI, and Blockchain.. s.l.:Wiley. 
Perry Xiao, 2019. Practical Java® Programming for IoT, AI, and Blockchain. Disadvantages. s.l.:Wiley. 
Sarker, Iqbal H., Faruque, Faisal, Hossen, Ujjal, Rahman, Atikur, 2015. A Survey of Software Development Process Models in Software Engineering. s.l.:s.n. 
Service, M. D., 2021. oracle. [Online]  
Available at: https://www.mysql.com/ 
World Health Organization, 2019. What is a health technology?. [Online]  Available at: https://www.who.int/health-technologyassessment/about/healthtechnology/en/ 





