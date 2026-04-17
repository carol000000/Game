import pygame

#初始化.視窗
pygame.init() #初始化

screen = pygame.display.set_mode((1500,800))

running = True

#遊戲迴圈
while running:
    #輸入
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    #更新

    #畫面

pygame.quit