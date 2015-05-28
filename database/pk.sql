USE [pro]
GO
/****** Object:  Table [dbo].[用户信息]    Script Date: 05/27/2015 00:40:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[用户信息](
	[UserName] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NULL,
 CONSTRAINT [PK_用户信息] PRIMARY KEY CLUSTERED 
(
	[UserName] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'', N'')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'fang', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'fangfang', N'789')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'fangtang', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'liu', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'qweqweqwe', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'si', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'tang', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'wang', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'yu', N'123')
INSERT [dbo].[用户信息] ([UserName], [password]) VALUES (N'zhao', N'123')
/****** Object:  Table [dbo].[路程信息]    Script Date: 05/27/2015 00:40:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[路程信息](
	[Start] [nvarchar](50) NOT NULL,
	[Destination] [nvarchar](50) NOT NULL,
	[Distance] [int] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'山大（威海）', N'华安观海大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'山大（威海）', N'光孚佳业大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'双丰电子大厦', N'自由东方', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'双丰电子大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'哈工大（威海）', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'威海体育场', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海体育场', N'威海一中', 600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'﻿山大（威海）', N'华安观海大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'山大（威海）', N'光孚佳业大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'双丰电子大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'双丰电子大厦', N'自由东方', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'自由东方', N'华安观海大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'福满堂', 1800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'哈工大（威海）', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'威海体育场', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海体育场', N'威海一中', 600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海新元建筑设计院', N'威海一中', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市地震局', N'威海新元建筑设计院', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海一中', N'古寨西路与昆明路路口', 1100)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'古寨西路与昆明路路口', N'威海市地震局', 1200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市地震局', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'古寨西路与昆明路路口', N'幸福商务大厦', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'幸福商务大厦', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海新元建筑设计院', N'财富广场', 2300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'财富广场', N'市政府', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'财富广场', N'电力大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'环翠楼风景区', N'威海市地震局', 1600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'电力大厦', N'威高广场', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威高广场', N'市政府', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威高广场', N'振华商厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'电力大厦', N'振华奥特莱斯', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'振华奥特莱斯', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华奥特莱斯', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华奥特莱斯', N'电力大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'幸福门', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'幸福门', N'威海旅游码头', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'定远舰景区', N'市政府', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'定远舰景区', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'威高广场', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'环翠楼风景区', N'电力大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市公安局交警分局', N'振华奥特莱斯', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市公安局交警分局', N'塔山公园', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'四十大道', 5500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市望岛小学', 2000)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市望岛小学', N'仙姑顶风景区', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市汽车站', 4200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市火车站', 4200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'刘公岛', 7200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'﻿山大（威海）', N'华安观海大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'山大（威海）', N'光孚佳业大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'双丰电子大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'双丰电子大厦', N'自由东方', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'自由东方', N'华安观海大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'福满堂', 1800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'哈工大（威海）', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'威海体育场', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海体育场', N'威海一中', 600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海新元建筑设计院', N'威海一中', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市地震局', N'威海新元建筑设计院', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海一中', N'古寨西路与昆明路路口', 1100)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'古寨西路与昆明路路口', N'威海市地震局', 1200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市地震局', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'古寨西路与昆明路路口', N'幸福商务大厦', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'幸福商务大厦', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海新元建筑设计院', N'财富广场', 2300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'财富广场', N'市政府', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'财富广场', N'电力大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'环翠楼风景区', N'威海市地震局', 1600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'电力大厦', N'威高广场', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威高广场', N'市政府', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威高广场', N'振华商厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'电力大厦', N'振华奥特莱斯', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'振华奥特莱斯', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华奥特莱斯', N'奥特莱斯商业中心', 800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华奥特莱斯', N'电力大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'幸福门', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'幸福门', N'威海旅游码头', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'定远舰景区', N'市政府', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'定远舰景区', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'威高广场', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'环翠楼风景区', N'电力大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市公安局交警分局', N'振华奥特莱斯', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市公安局交警分局', N'塔山公园', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'振华商厦', N'四十大道', 5500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市望岛小学', 2000)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市望岛小学', N'仙姑顶风景区', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市汽车站', 4200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'四十大道', N'威海市火车站', 4200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海旅游码头', N'刘公岛', 7200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'﻿山大（威海）', N'华安观海大厦', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'山大（威海）', N'光孚佳业大厦', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'双丰电子大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'双丰电子大厦', N'自由东方', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'自由东方', N'华安观海大厦', 300)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'光孚佳业大厦', N'福满堂', 1800)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'哈工大（威海）', 200)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'福满堂', N'威海体育场', 700)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海体育场', N'威海一中', 600)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海新元建筑设计院', N'威海一中', 400)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海市地震局', N'威海新元建筑设计院', 500)
INSERT [dbo].[路程信息] ([Start], [Destination], [Distance]) VALUES (N'威海一中', N'古寨西路与昆明路路口', 1100)
GO
/****** Object:  Table [dbo].[节点]    Script Date: 05/27/2015 00:40:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[节点](
	[Location] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[节点] ([Location]) VALUES (N'﻿山大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'华安观海大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'光孚佳业大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'双丰电子大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'自由东方')
INSERT [dbo].[节点] ([Location]) VALUES (N'福满堂')
INSERT [dbo].[节点] ([Location]) VALUES (N'哈工大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海体育场')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海一中')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海新元建筑设计院')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市地震局')
INSERT [dbo].[节点] ([Location]) VALUES (N'奥特莱斯商业中心')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福商务大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'财富广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'市政府')
INSERT [dbo].[节点] ([Location]) VALUES (N'电力大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'威高广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华商厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'定远舰景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'环翠楼风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市公安局交警分局')
INSERT [dbo].[节点] ([Location]) VALUES (N'塔山公园')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福门')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海旅游码头')
INSERT [dbo].[节点] ([Location]) VALUES (N'四十大道')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市望岛小学')
INSERT [dbo].[节点] ([Location]) VALUES (N'仙姑顶风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市汽车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市火车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'刘公岛')
INSERT [dbo].[节点] ([Location]) VALUES (N'古寨西路与昆明路路口')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华奥特莱斯')
INSERT [dbo].[节点] ([Location]) VALUES (N'﻿山大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'华安观海大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'光孚佳业大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'双丰电子大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'自由东方')
INSERT [dbo].[节点] ([Location]) VALUES (N'福满堂')
INSERT [dbo].[节点] ([Location]) VALUES (N'哈工大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海体育场')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海一中')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海新元建筑设计院')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市地震局')
INSERT [dbo].[节点] ([Location]) VALUES (N'奥特莱斯商业中心')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福商务大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'财富广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'市政府')
INSERT [dbo].[节点] ([Location]) VALUES (N'电力大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'威高广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华商厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'定远舰景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'环翠楼风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市公安局交警分局')
INSERT [dbo].[节点] ([Location]) VALUES (N'塔山公园')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福门')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海旅游码头')
INSERT [dbo].[节点] ([Location]) VALUES (N'四十大道')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市望岛小学')
INSERT [dbo].[节点] ([Location]) VALUES (N'仙姑顶风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市汽车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市火车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'刘公岛')
INSERT [dbo].[节点] ([Location]) VALUES (N'古寨西路与昆明路路口')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华奥特莱斯')
INSERT [dbo].[节点] ([Location]) VALUES (N'﻿山大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'华安观海大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'光孚佳业大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'双丰电子大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'自由东方')
INSERT [dbo].[节点] ([Location]) VALUES (N'福满堂')
INSERT [dbo].[节点] ([Location]) VALUES (N'哈工大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海体育场')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海一中')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海新元建筑设计院')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市地震局')
INSERT [dbo].[节点] ([Location]) VALUES (N'奥特莱斯商业中心')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福商务大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'财富广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'市政府')
INSERT [dbo].[节点] ([Location]) VALUES (N'电力大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'威高广场')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华商厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'定远舰景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'环翠楼风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市公安局交警分局')
INSERT [dbo].[节点] ([Location]) VALUES (N'塔山公园')
INSERT [dbo].[节点] ([Location]) VALUES (N'幸福门')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海旅游码头')
INSERT [dbo].[节点] ([Location]) VALUES (N'四十大道')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市望岛小学')
INSERT [dbo].[节点] ([Location]) VALUES (N'仙姑顶风景区')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市汽车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'威海市火车站')
INSERT [dbo].[节点] ([Location]) VALUES (N'刘公岛')
INSERT [dbo].[节点] ([Location]) VALUES (N'古寨西路与昆明路路口')
INSERT [dbo].[节点] ([Location]) VALUES (N'振华奥特莱斯')
INSERT [dbo].[节点] ([Location]) VALUES (N'﻿山大（威海）')
INSERT [dbo].[节点] ([Location]) VALUES (N'华安观海大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'光孚佳业大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'双丰电子大厦')
INSERT [dbo].[节点] ([Location]) VALUES (N'自由东方')
GO
