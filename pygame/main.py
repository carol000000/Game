import pygame

#設定
FPS = 60

#初始化.視窗
pygame.init() #初始化

screen = pygame.display.set_mode((1500,800)) #視窗
clock = pygame.time.Clock()
running = True

#遊戲迴圈
while running:
    clock.tick(FPS) #一秒內最多執行n次FPS

    #如果遊戲關閉
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    #更新

    #畫面
    screen.fill((96,152,44)) #視窗填滿顏色RGB
    pygame.display.update() #更新畫面

pygame.quit