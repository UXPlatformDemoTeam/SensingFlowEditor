# SensingFlow Editor

##Requirements
To compile and build the SensingFlow Editor, install the following dependencies:
* Java Development Kit (JDK) version 1.6 or greater which includes the JRE
* Eclipse Modeling Package
  1. ``Help`` - ``Install New Software``
  2. Select ``Luna - http://download.eclipse.org/releases/luna`` from the ``Work with`` dropdown.
  3. Select Modeling from the package list and click ``Next`` to install the package.

##Build and run the editor
1. Import ``Sensingflow`` and ``jdom2`` project in your workspace.
2. Run ``sensingflow.gef`` as Eclipse application

##Create a new Sensingflow project
1. Navigate to ``File``-``New``-``Project``
2. Select ``General``-``Project`` from the list
3. Enter the project name and choose the location, and click ``Finish``
4. From the Project Exlorer view, right click on the create project and select ``New``-``Other``
5. Find and choose ``Sensingflow Model`` from the list and click ``Next``
6. Enter the file name and click Next
7. From the ``Model Object`` menu, choose ``Processor``, and click ``Finish``

##Draw and save a Sensingflow diagram
1. From the Palette, choose a node type you want to add:
>The palette starts folded by default.  
>To open it, click the small triangle on the right side of the editor.

2. Select the node created, change the Operator Name attribute from the Property view. 
3. After finishing the work, save the diagram via ``File``-``Save`` or ``Ctrl+S``.

##Load an exising processor configuration file (e.g., processor_info.xml)
1. Create a new project if there is no active project.
2. From the Project Explorer view, right click on the project your created and select ``import``
3. Choose ``General``-``File System``
4. Select the directory where the file your want to import exists
5. Select the file(s) from the list on the right side and click ``Finish``
