-- Exercice 3 : Ajout de contraintes( Contrainte d'unicité pour éviter les installations multiples du même logiciel)



-- 1. Contrainte pour empêcher l'installation multiple du même logiciel sur un poste

-- (Cette contrainte existe déjà via la clé primaire (nPoste, nLog) dans la table Installer)

-- Si elle n'existe pas, on peut l'ajouter avec :

ALTER TABLE Installer

ADD CONSTRAINT unique\_installation UNIQUE (nPoste, nLog);







2\. Ajout des contraintes de clés étrangères

-- Contraintes de clés étrangères pour l'intégrité référentielle



-- Table Salle vers Segment

ALTER TABLE Salle

ADD CONSTRAINT fk\_salle\_segment

FOREIGN KEY (indIP) REFERENCES Segment(indIP);



-- Table Poste vers Segment

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_segment

FOREIGN KEY (indIP) REFERENCES Segment(indIP);



-- Table Poste vers Salle

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_salle

FOREIGN KEY (nSalle) REFERENCES Salle(nSalle);



-- Table Installer vers Poste

ALTER TABLE Installer

ADD CONSTRAINT fk\_installer\_poste

FOREIGN KEY (nPoste) REFERENCES Poste(nPoste);



-- Table Installer vers Logiciel

ALTER TABLE Installer

ADD CONSTRAINT fk\_installer\_logiciel

FOREIGN KEY (nLog) REFERENCES Logiciel(nLog);



-- Table Types (contrainte pour lier typePoste de Poste à typeLP de Types)

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_types

FOREIGN KEY (typePoste) REFERENCES Types(typeLP);



-- Table Logiciel vers Types (pour typeLog)

ALTER TABLE Logiciel

ADD CONSTRAINT fk\_logiciel\_types

FOREIGN KEY (typeLog) REFERENCES Types(typeLP);









##### Version complète avec vérifications :





-- Exercice 3 : Ajout de contraintes



-- 1. Vérification et ajout de la contrainte d'unicité pour les installations

-- (Si la clé primaire n'existe pas déjà)

ALTER TABLE Installer

ADD CONSTRAINT unique\_installation\_postelogiciel UNIQUE (nPoste, nLog);



-- 2. Ajout de toutes les contraintes de clés étrangères

-- Salle -> Segment

ALTER TABLE Salle

ADD CONSTRAINT fk\_salle\_segment

FOREIGN KEY (indIP) REFERENCES Segment(indIP)

ON DELETE SET NULL

ON UPDATE CASCADE;



-- Poste -> Segment

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_segment

FOREIGN KEY (indIP) REFERENCES Segment(indIP)

ON DELETE SET NULL

ON UPDATE CASCADE;



-- Poste -> Salle

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_salle

FOREIGN KEY (nSalle) REFERENCES Salle(nSalle)

ON DELETE SET NULL

ON UPDATE CASCADE;



-- Installer -> Poste

ALTER TABLE Installer

ADD CONSTRAINT fk\_installer\_poste

FOREIGN KEY (nPoste) REFERENCES Poste(nPoste)

ON DELETE CASCADE

ON UPDATE CASCADE;



-- Installer -> Logiciel

ALTER TABLE Installer

ADD CONSTRAINT fk\_installer\_logiciel

FOREIGN KEY (nLog) REFERENCES Logiciel(nLog)

ON DELETE CASCADE

ON UPDATE CASCADE;



-- Poste -> Types (pour typePoste)

ALTER TABLE Poste

ADD CONSTRAINT fk\_poste\_type

FOREIGN KEY (typePoste) REFERENCES Types(typeLP)

ON DELETE SET NULL

ON UPDATE CASCADE;



-- Logiciel -> Types (pour typeLog)

ALTER TABLE Logiciel

ADD CONSTRAINT fk\_logiciel\_type

FOREIGN KEY (typeLog) REFERENCES Types(typeLP)

ON DELETE SET NULL

ON UPDATE CASCADE;

