import pygame

#設定
FPS = 60
h = 1500 #高
w = 800 #寬
bg = (96,152,44) #背景
gamename = "Poop Game"


#初始化.視窗
pygame.init() #初始化

screen = pygame.display.set_mode((h,w)) #視窗
pygame.display.set_caption(gamename)
clock = pygame.time.Clock()
running = True


class Player(pygame.sprite.Sprite):
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = pygame.Surface((50,50)) #顯示的圖片
        self.image.fill((255,255,255))
        self.rect = self.image.get_rect() #定位圖片
        self.rect.x = 200
        self.rect.y = 200

all_sprites = pygame.sprite.Group() #物件的群組
player = Player()
all_sprites.add(player)

#遊戲迴圈
while running:
    clock.tick(FPS) #一秒內最多執行n次FPS

    #如果遊戲關閉
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    #更新

    #畫面
    screen.fill(bg) #視窗填滿顏色RGB
    all_sprites.draw(screen)
    pygame.display.update() #更新畫面

pygame.quit()