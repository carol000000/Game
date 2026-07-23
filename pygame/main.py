import pygame
import os
import random
print(os.getcwd())

#設定
FPS = 60
h = 1500 #高
w = 800 #寬
bg = (96,152,44) #背景
gamename = "Poop Game"

#主角
p1s = 5

#敵人
p2s = 2

#初始化.視窗
pygame.init() #初始化

screen = pygame.display.set_mode((h,w)) #視窗
pygame.display.set_caption(gamename)
clock = pygame.time.Clock()
running = True

#圖片
playerImg = pygame.image.load(os.path.join("pygame","img","player01.png")).convert_alpha()
poopImg = pygame.image.load(os.path.join("pygame","img","poop.png"))



class Player(pygame.sprite.Sprite):
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = playerImg  
        self.rect = self.image.get_rect() #定位圖片
        self.rect.x = 750
        self.rect.y = 400
    def update(self):
        key_pressed = pygame.key.get_pressed()
        if key_pressed[pygame.K_w]:
            self.rect.y -=p1s

        if key_pressed[pygame.K_s]:
            self.rect.y +=p1s

        if key_pressed[pygame.K_a]:
            self.rect.x -=p1s

        if key_pressed[pygame.K_d]:
            self.rect.x +=p1s


        if self.rect.left > h:
            self.rect.right = 0
        elif self.rect.right < 0:
            self.rect.left = h

        if self.rect.top > w:
            self.rect.bottom = 0
        elif self.rect.bottom < 0:
            self.rect.top = w

class Poop(pygame.sprite.Sprite):
        def __init__(self):
            pygame.sprite.Sprite.__init__(self)
            self.image = pygame.Surface((50,50))
            self.image = poopImg 
            self.rect = self.image.get_rect() #定位圖片
            self.rect.x = random.randint(0,1500)
            self.rect.y = random.randint(0,800)
        
        def update(self):
            px = player.rect.x - self.rect.x
            py = player.rect.y - self.rect.y
            pxy = ((px*px)+(py*py))**0.5

            if pxy == 0:
                p2x =px/(pxy+1)
                p2y =py/(pxy+1)

            else:
                p2x =px/pxy
                p2y =py/pxy

            self.rect.x += round(p2x)*p2s
            self.rect.y += round(p2y)*p2s

class  Bullet(pygame.sprite.Sprite):
        def __init__(self):
            pygame.sprite.Sprite.__init__(self)
            self.image = pygame.Surface((10,10))
            self.image.fill((255,255,255))
            self.rect = self.image.get_rect() #定位圖片




            

all_sprites = pygame.sprite.Group() #物件的群組
player = Player()
poop = Poop()
bullet =Bullet()
all_sprites.add(player)
all_sprites.add(poop)
all_sprites.add(bullet)

#遊戲迴圈
while running:
    clock.tick(FPS) #一秒內最多執行n次FPS

    #如果遊戲關閉
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    #更新
    all_sprites.update()

    #畫面
    screen.fill(bg) #視窗填滿顏色RGB
    all_sprites.draw(screen)
    #screen.blit()
    pygame.display.update() #更新畫面

pygame.quit()