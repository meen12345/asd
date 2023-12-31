CREATE TABLE TBL_CATEGORY
(CATEGORY_CODE NUMBER CONSTRAINT PK_CATEGORY_CODE PRIMARY KEY,
 CATEGORY_NAME VARCHAR(20) CONSTRAINT UN_CATEGORY_NAME UNIQUE
                           CONSTRAINT NN_CATEGORY_NAME NOT NULL
 );


CREATE TABLE TBL_MUSIC(
MUSIC_CODE NUMBER PRIMARY KEY,
MUSIC_NAME VARCHAR(20) NOT NULL,
MUSIC_SINGER VARCHAR(20) NOT NULL,
CATEGORY_CODE NUMBER REFERENCES TBL_CATEGORY(CATEGORY_CODE) NOT NULL,
PLAYABLE_STATUS CHAR(5) CHECK(PLAYABLE_STATUS IN ('Y' , 'N')));

CREATE SEQUENCE SEQ_CATEGORY_CODE
INCREMENT BY 1
START WITH 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE
NOCACHE;

CREATE SEQUENCE SEQ_MUSIC_CODE
INCREMENT BY 1
START WITH 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE
NOCACHE;

INSERT
INTO TBL_CATEGORY
(CATEGORY_CODE, CATEGORY_NAME)
VALUES
(SEQ_CATEGORY_CODE.NEXTVAL, '������');

INSERT
INTO TBL_CATEGORY
(CATEGORY_CODE, CATEGORY_NAME)
VALUES
(SEQ_CATEGORY_CODE.NEXTVAL, '�߶��');

INSERT
INTO TBL_CATEGORY
(CATEGORY_CODE, CATEGORY_NAME)
VALUES
(SEQ_CATEGORY_CODE.NEXTVAL, '����');

INSERT
INTO TBL_CATEGORY
(CATEGORY_CODE, CATEGORY_NAME)
VALUES
(SEQ_CATEGORY_CODE.NEXTVAL, '��');

INSERT
INTO TBL_CATEGORY
(CATEGORY_CODE, CATEGORY_NAME)
VALUES
(SEQ_CATEGORY_CODE.NEXTVAL, '�˾غ�');



INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '������', '���座��',1,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '���Ķ�', '������ũ',1,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '���̳ʸ���Ʈ', '��ź�ҳ��',1,'Y');



INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '�������', '�̻�',2,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '��ó��', '��',2,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, 'Why', '��ƿ�',2,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '��', '�۹�ȣ',3,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '������', '�۹�ȣ',3,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '������Ʈ��', 'â��',3,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '����������', 'ü������',4,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '��й�ȣ486', '����',4,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '����', 'ũ����',5,'Y');

INSERT INTO TBL_MUSIC
(MUSIC_CODE, MUSIC_NAME, MUSIC_SINGER,CATEGORY_CODE,PLAYABLE_STATUS)
VALUES
(SEQ_MUSIC_CODE.NEXTVAL, '���׿�', 'â��',5,'Y');